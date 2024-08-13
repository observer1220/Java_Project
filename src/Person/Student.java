package Person;

public class Student extends Person {
    private int grades;

    public Student(String name, int age, String address, int grades) {
        super(name, age, address);
        this.grades = grades;
    }

    public void learn() {
        System.out.println("Learning..." + grades);
    }

    public void walk(String type) {
        System.out.println("Student " + type + " like a boss.");
    }
}
