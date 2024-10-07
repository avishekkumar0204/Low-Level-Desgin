package DesginPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        /*
        As soon as i moved the validations to Builder class, is there anyone stopping me to do
        Student s = new Student(new Builder());
        This means we can now create a student object without any validation.

        So, let make Student constructor private.
        But as soon as i will make Student constructor private build() method of builder class will start giving
        error because we are creating object of student there. Becasue we have made constructor private. Now only member
        inside student class can call student construtor.

        So, let move Builder class inside Student class --- Inner class
        But as soon as i will move Builder class inside student class getBuilder() method which is static will start
        giving error because static method can only access static data menmbers. So, lets make Builder class static...

         */
       Student s = Student.getBuilder().setId(4).setName("Avishek").build();


    }
}
