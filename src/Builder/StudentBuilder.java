package Builder;

public class StudentBuilder {
    int id;
    String name;
    int age;
    String batch;
    int gradYear;

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    public StudentBuilder setBatch(String batch) {
        this.batch = batch;
        return this;
    }
    public StudentBuilder setGradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
    }

    Student build(){
        return new Student(this);
    }
}
