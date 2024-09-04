package BuilderEx2;

public class Client {
    public static void main(String[] args) {
        Student b = Student.getBuilder()
                .setName("Avishek")
                .setAge(24)
                .setRollNo(4)
                .setGender("M")
                .setBatch("XYASA")
                .build();
        String name = b.getName();
        System.out.println(name);
        // Problem solved by making class inner class of student
        // made inner class static as we were trying to create object of StudentBuilder class from static method.
    }
}
