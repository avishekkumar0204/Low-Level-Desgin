package DesginPatterns.Builder;
import DesginPatterns.Builder.CustomExceptions.*;

public class Student {
    private int id;
    private String name;
    private String batch;
    private double psp;
    private int age;

    Student(Builder builder){
        // I can now add validation over here!!
        if(builder.getId() <= 0){
            throw new IdNotValid("Student id must be greater than 0");
        }
        if(builder.getName() == null){
            throw new NameNotPresent("Student name must be present");
        }
        this.id = builder.getId();
        this.name = builder.getName();
        this.batch = builder.getBatch();
        this.psp = builder.getPsp();
        this.age = builder.getAge();
    }
}
