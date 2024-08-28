import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    private static Account account = new Account();

    private static class Account {
        private int balance = 0;
        private static Lock lock = new ReentrantLock();
        private static Condition newDeposit = lock.newCondition();

        public int getBalance() {
            return this.balance;
        }

        public void deposit(int amount) {
            lock.lock();
            balance += amount;
            System.out.println("Deposit $" + amount + "\t\t\t Total Amount $" + getBalance());
            newDeposit.signalAll();
            lock.unlock();
        }

        public void withdraw(int amount) {
            lock.lock();
            try {
                while (balance < amount) {
                    System.out.println("Try to withdraw $" + amount + " but total amount is not enough. Wait for a deposit");
                    newDeposit.await();
                }
                balance -= amount;
                System.out.println("Withdraw $" + amount + "\t\t Total Amount $" + getBalance());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }

        public static class DepositTask implements Runnable {
            @Override
            public void run() {
                try {
                    while (true) {
                        account.deposit((int) (Math.random() * 20) + 5);
                        Thread.sleep(5000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public static class WithdrawTask implements Runnable {
            @Override
            public void run() {
                while (true) {
                    account.withdraw((int) (Math.random() * 20) + 5);
                }
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Account.DepositTask());
        executorService.execute(new Account.WithdrawTask());
        executorService.shutdown();
    }
}
