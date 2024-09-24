package ExceptionHandling;

import java.io.FileNotFoundException;

public class Client {
    public static void main(String[] args) throws FileNotFoundException, StudentNotFoundException {
        int res = Student.doSomething(7);
        System.out.println(res);
    }
}
