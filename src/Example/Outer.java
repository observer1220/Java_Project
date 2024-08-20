package Example;

public class Outer {
    private int i = 0;

    private void printHello() {
        System.out.println("HELLO");
    }

    class Inner {
        void printI() {
            System.out.println(i);
            printHello();
        }
    }
}
