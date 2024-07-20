package PrototypeAndRegistry;

public class Student implements Prototype<Student>{
    private int id;
    private String name;
    private String batch;

    Student(){};
    
    Student(Student st) {
        this.id = st.id;
        this.name = st.name;
        this.batch = st.batch;
    }

    public Student copy(){
        Student s = new Student(this);
        return s;
    }
}
