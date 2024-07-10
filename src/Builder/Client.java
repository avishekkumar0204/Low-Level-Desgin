package Builder;

public class Client {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentBuilder();
        studentBuilder.setId(1);
        studentBuilder.setName("Avishek");
        studentBuilder.setBatch("Aug23");

        Student s1 = new Student(studentBuilder);
    }
}
