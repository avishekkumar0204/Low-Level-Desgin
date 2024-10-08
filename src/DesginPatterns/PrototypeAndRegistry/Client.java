package DesginPatterns.PrototypeAndRegistry;

public class Client {
    public static void fillRegistry(Registry registry){
        Student s = new Student(10, "Samar", 25);
        IntelligentStudent is = new IntelligentStudent(4, "Avishek", 25, 150);
        registry.setPrototype(Prototypes.NORMAL_STUDENT, s);
        registry.setPrototype(Prototypes.INTELLIGENT_STUDENT, is);
    }

    // This method can get s as Student/ Intelligent student
    public static Student getStudentCopy(Student s){
        // Runtime polymorphism -> clone() method of class whose object we are getting as args will be called.
        return s.clone();
    }

    public static void main(String[] args) {
        Registry registry = new Registry();
        fillRegistry(registry);
        Student st = getStudentCopy(registry.getPrototype(Prototypes.NORMAL_STUDENT));
        Student is = getStudentCopy(registry.getPrototype(Prototypes.INTELLIGENT_STUDENT));
    }
}
