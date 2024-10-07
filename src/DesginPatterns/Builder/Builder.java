package DesginPatterns.Builder;

import DesginPatterns.Builder.CustomExceptions.*;


public class Builder {
    private int id;
    private String name;
    private String batch;
    private double psp;
    private int age;

    Builder setId(int id){
        this.id = id;
        return this;
    }
    Builder setName(String name){
        this.name = name;
        return this;
    }
    Builder setBatch(String batch){
        this.batch = batch;
        return this;
    }
    Builder setPsp(double psp){
        this.psp = psp;
        return this;
    }
    Builder setAge(int age){
        this.age = age;
        return this;
    }

    Student build(){
        // Moved validations also to Builder class -> Means if data is not valid we are not even calling constructor.
        if(this.getId() <= 0){
            throw new IdNotValid("Student id must be greater than 0");
        }
        if(this.getName() == null){
            throw new NameNotPresent("Student name must be present");
        }
        return new Student(this);
    }

    int getId(){ return this.id; }
    String getName(){ return this.name; };
    String getBatch(){ return this.batch; }
    double getPsp(){ return this.psp;}
    int getAge(){ return this.age;}
}
