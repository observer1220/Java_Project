import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Semaphore {
    static int[] buffer = new int[3];
    static int producerIndex = 0;
    static int consumerIndex = 0;
    static java.util.concurrent.Semaphore s_lock, n_lock, e_lock;

    private static void append(int i) {
        buffer[producerIndex] = i;
        if (producerIndex != buffer.length - 1) {
            producerIndex++;
        } else {
            producerIndex = 0;
        }
    }

    private static int take() {
        int tmp = buffer[producerIndex];
        if (consumerIndex != buffer.length - 1) {
            consumerIndex++;
        } else {
            consumerIndex = 0;
        }
        return tmp;
    }

    private static class ProduceTask implements Runnable {
        int thread_id;

        public ProduceTask(int thread_id) {
            this.thread_id = thread_id;
            System.out.println("Producer # " + thread_id + " launched.");
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 20; i++) {
                    e_lock.acquire();
                    s_lock.acquire();
                    int randomInt = (int) (Math.random() * 10);
                    System.out.println("Producer # " + thread_id + " produced " + randomInt);
                    append(randomInt);
                    s_lock.release();
                    n_lock.release();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class ConsumerTask implements Runnable {
        int thread_id;

        public ConsumerTask(int thread_id) {
            this.thread_id = thread_id;
            System.out.println("Consumer # " + thread_id + " launched.");
        }

        @Override
        public void run() {
            try {
                int value_took;
                for (int i = 0; i < 20; i++) {
                    n_lock.acquire();
                    s_lock.acquire();
                    value_took = take();
                    System.out.println("Consumer # " + thread_id + " cosumed " + value_took);
                    s_lock.release();
                    e_lock.release();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Using " + 4 + " threads.");
        s_lock = new java.util.concurrent.Semaphore(1);
        n_lock = new java.util.concurrent.Semaphore(0);
        e_lock = new java.util.concurrent.Semaphore(buffer.length);

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                executorService.execute(new ProduceTask(i));
            } else {
                executorService.execute(new ConsumerTask(i));
            }
        }
        executorService.shutdown();
    }
}
