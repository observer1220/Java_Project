import Person.Person;
import Person.Student;
import Person.Teacher;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person t1 = new Teacher("Louis", 34, "Hawaii", "Math");
        Person t2 = new Teacher("Jennifer", 26, "Taiwan", "Computer Science");
        Person s1 = new Student("Kent", 18, "Taiwan", 88);
        Person s2 = new Student("Wilson", 20, "Hawaii", 87);

        ArrayList<Person> person = new ArrayList<Person>();
        person.add(t1);
        person.add(t2);
        person.add(s1);
        person.add(s2);

        for (int i = 0; i < 4; i++) {
            System.out.print(person.get(i).getName() + " ");
        }
    }
}
