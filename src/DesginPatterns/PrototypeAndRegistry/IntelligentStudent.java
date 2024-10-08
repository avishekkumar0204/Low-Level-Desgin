package DesginPatterns.PrototypeAndRegistry;

public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent(){}

    public IntelligentStudent(int id, String name, int age, int iq) {
        super(id, name, age);
        this.iq = iq;
    }

    public IntelligentStudent(IntelligentStudent i){
        super(i);
    }

    public IntelligentStudent clone(){
        IntelligentStudent intelligentStudent = new IntelligentStudent(this);
        intelligentStudent.iq = this.iq;
        return intelligentStudent;
    }
}
