package BuilderEx2;

public class Client {
    public static Exception main(String[] args) {
        Student b = Student.getBuilder()
                .setName("Avishek")
                .setAge(24)
                .setRollNo(4)
                .setGender("M")
                .setBatch("XYASA")
                .build();
        // Still with the current implementation it is possible that some one created a builder object
        // normally and created Student object with that without having any validation since validation is
        // inside build method.

        // Above problem occured as constuctor is public
        // But if we make constructor private then inside build method of StudentBuilder class also. We wo't be
        // able to create a object of Student.
    }
}
