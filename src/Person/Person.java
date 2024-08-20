package Person;

public class Person {
    protected String name;
    protected int age;
    protected String address;
    protected int homeland;

    public Person() {
        this.name = "A Example.Person";
        this.age = 0;
        this.address = "Taiwan";
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void walk() {
        System.out.println("Walking...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    public void greeting() {
        System.out.println("Hello from Example.Person class.");
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object p) {
        // 檢查傳入的參數 p 是否為 Example.Person 類別的實例
        if (p instanceof Person) {
            // 如果 p 是 Example.Person 的實例，則將其轉型為 Example.Person 類別
            Person person = (Person) p;
            return this.age == person.age;
        }
        return false;
    }
}
