public class Main {
    public static void main(String[] args) {
        Info<String> info = new Info<>();
        info.setInfo("Hello World");
        String message = info.getInfo();
        System.out.println(message);


    }
}
