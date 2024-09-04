package BuilderEx2;

public class Student {
    private String name;
    private int age;
    private int rollNo;
    private String gender;
    private String batch;

    private Student(StudentBuilder sb){
        this.name = sb.getName();
        this.age = sb.getAge();
        this.rollNo = sb.getRollNo();
        this.gender = sb.getGender();
        this.batch = sb.getBatch();
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getRollNo() {
        return rollNo;
    }
    public String getGender() {
        return gender;
    }
    public String getBatch() {
        return batch;
    }

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        private String name;
        private int age;
        private int rollNo;
        private String gender;
        private String batch;

        public StudentBuilder(){};

        public StudentBuilder setName(String name){
            this.name = name;
            return this;
        }
        public StudentBuilder setAge(int age){
            this.age = age;
            return this;
        }
        public StudentBuilder setRollNo(int rollNo){
            this.rollNo = rollNo;
            return this;
        }
        public StudentBuilder setGender(String gender){
            this.gender = gender;
            return this;
        }
        public StudentBuilder setBatch(String batch){
            this.batch = batch;
            return this;
        }

        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        public int getRollNo(){
            return rollNo;
        }
        public String getGender(){
            return gender;
        }
        public String getBatch(){
            return batch;
        }



        public boolean validate(){
            if(rollNo <= 0 || age < 18)
                return false;
            return true;
        }

        public Student build(){
            validate();
            return new Student(this);
        }

    }

}
