package DesginPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setId(7);
        builder.setName("Avishek");
        builder.setBatch("Oct23");

        Student s1 = new Student(builder);
    }
}
