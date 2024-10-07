package DesginPatterns.Builder;

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
        return new Student(this);
    }

    int getId(){ return this.id; }
    String getName(){ return this.name; };
    String getBatch(){ return this.batch; }
    double getPsp(){ return this.psp;}
    int getAge(){ return this.age;}
}
