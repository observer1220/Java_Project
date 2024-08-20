package Example;

/**
 * This class shows how to create a person by name and Example.Nationality.
 */
public class Person {
    private String name;
    private int age;
    private String major;
    private double gpa;
    private Nationality homeland;
    private Person spouse;

    public Nationality getHomeland() {
        return homeland;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public Person setMajor(String major) {
        this.major = major;
        return this;
    }

    public Person setGpa(double gpa) {
        this.gpa = gpa;
        return this;
    }

    /**
     * This constructor instantiates a person by name and nationality
     *
     * @param name  person name
     * @param age   person age
     * @param major person major
     * @param gpa   person gpa
     * @param h     Enum Example.Nationality
     */
    public Person(String name, int age, String major, double gpa, Nationality h) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.gpa = gpa;
        this.homeland = h;
    }

    public void talk() {
        System.out.println("Hello, my name is " + name);
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    /**
     * Getter method for private field name
     *
     * @return a string, person's name
     */
    public String getName() {
        return this.name;
    }
}
