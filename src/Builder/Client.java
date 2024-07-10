package Builder;

public class Client {
    public static void main(String[] args) {
        Student s1 = Student.getStudentBuilder()
                .setId(4)
                .setName("Avishek")
                .setBatch("Aug23")
                .build();
    }
}
