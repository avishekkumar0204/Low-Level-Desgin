package LambdaExpression;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(4, "Avishek"));
        students.add(new Student(1, "Golu"));
        students.add(new Student(8, "Mahesh"));
        students.add(new Student(12, "Sameer"));
        students.add(new Student(40, "Dompu"));
        students.add(new Student(2, "Shampoo"));

        // Instead of creating StudentRollComparator class which implement functional interface
        // Comparator and passing it as second arg of sort method, we can directly create a object of functional
        // interface Comparator and pass it as second arg.

        // we don't even need arg type to pass, it will automatically map from Comparator<Student>

        // Since it only had one line of code {} and return statement is optional
        // Comparator<Student> c = (s1, s2) -> Integer.compare(s1.age, s2.age);

        Collections.sort(students, (s1, s2) -> Integer.compare(s1.age, s2.age));

        for(Student s : students) {
            System.out.println(s.age + " " + s.name);
        }

    }
}
