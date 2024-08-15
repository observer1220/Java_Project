public class Person {
    private String name;
    private int age;
    private Person spouse;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void talk() {
        System.out.println("Hello, my name is " + name);
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public String getName() {
        return this.name;
    }
}
