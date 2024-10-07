package DesginPatterns.Builder;

public class Student {
    private int id;
    private String name;
    private String batch;
    private double psp;
    private int age;

    Student(Builder builder){
        this.id = builder.getId();
        this.name = builder.getName();
        this.batch = builder.getBatch();
        this.psp = builder.getPsp();
        this.age = builder.getAge();
    }

    public static Builder getBuilder(){ return new Builder(); }
}
