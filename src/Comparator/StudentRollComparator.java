package Comparator;

import java.util.Comparator;

public class StudentRollComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.age, s2.age);
    }
}
