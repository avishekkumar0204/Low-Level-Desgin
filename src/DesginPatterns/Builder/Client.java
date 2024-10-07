package DesginPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        /*
         Still to create a object of student class client needs to first create a builder object
         and then need to pass that to Student constructor.
         So, is there a way to get rid of Builder from client class. So, that client will now feel like
         to create a object of student we first need to create a object of Builder??
         Ans:: To achieve above thing, I have created a method build inside a Builder class which will be called
         upon object of Builder class and that method will help creating student object. (Full abstraction)
         */

        Student s = Student.getBuilder()
                .setId(10)
                .setName("Avishek")
                .setBatch("Oct23")
                .build();


    }
}
