package Builder;

public class Student {
    int id;
    String name;
    int age;
    String batch;
    int gradYear;

    void checkValidation(StudentBuilder studentBuilder){
        if(studentBuilder.id < 0) {
            throw new IllegalArgumentException("Student id cannot be negative");
        }
        else if(studentBuilder.batch == null){
            throw new IllegalArgumentException("Student batch cannot be null");
        }
    }

    Student(StudentBuilder studentBuilder) {
        checkValidation(studentBuilder);
        this.id = studentBuilder.id;
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.batch = studentBuilder.batch;
        this.gradYear = studentBuilder.gradYear;
    }
}
