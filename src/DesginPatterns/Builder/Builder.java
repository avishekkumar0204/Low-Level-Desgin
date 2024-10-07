package DesginPatterns.Builder;

public class Builder {
    private int id;
    private String name;
    private String batch;
    private double psp;
    private int age;

    void setId(int id){
        this.id = id;
    }
    void setName(String name){
        this.name = name;
    }
    void setBatch(String batch){
        this.batch = batch;
    }
    void setPsp(double psp){
        this.psp = psp;
    }
    void setAge(int age){
        this.age = age;
    }

    int getId(){ return this.id; }
    String getName(){ return this.name; };
    String getBatch(){ return this.batch; }
    double getPsp(){ return this.psp;}
    int getAge(){ return this.age;}
}
