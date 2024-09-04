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
    }
}
