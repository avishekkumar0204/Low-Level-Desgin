package ExceptionHandling;

/*
    Custom Runtime Exception
 */
public class StudentFileNotFoundException extends RuntimeException {
    StudentFileNotFoundException(){
        super("Student file not found");
    }
}
