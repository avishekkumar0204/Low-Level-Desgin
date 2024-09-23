package Comparator;

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

        StudentRollComparator src = new StudentRollComparator();
        Collections.sort(students, src);

        for(Student student : students){
            System.out.println(student.age + " " + student.name);
        }

    }
}
