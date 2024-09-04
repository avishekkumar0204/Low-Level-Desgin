package BuilderEx2;

public class Student {
    private String name;
    private int age;
    private int rollNo;
    private String gender;
    private String batch;

    Student(StudentBuilder sb){
        this.name = sb.getName();
        this.age = sb.getAge();
        this.rollNo = sb.getRollNo();
        this.gender = sb.getGender();
        this.batch = sb.getBatch();
    }

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }
}
