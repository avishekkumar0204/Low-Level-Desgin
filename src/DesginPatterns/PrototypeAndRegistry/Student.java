package DesginPatterns.PrototypeAndRegistry;

public class Student implements Prototype<Student>{
    private int id;
    private String name;
    private int age;

    public Student(){}

    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Student(Student s){
        this.id = s.id;
        this.name = s.name;
        this.age = s.age;
    }

    public Student clone(){
        return new Student(this);
    }
}
