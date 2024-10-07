package DesginPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        // Added the getBuilder method inside a Student class.
        Builder builder = Student.getBuilder().setId(4).setName("Avishek").setBatch("Oct23");
        Student s1 = new Student(builder);
    }
}
