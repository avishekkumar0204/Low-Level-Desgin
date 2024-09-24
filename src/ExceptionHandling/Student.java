package ExceptionHandling;

import java.io.FileNotFoundException;

public class Student {
    public static int doSomething(int x) throws FileNotFoundException, StudentNotFoundException {
        if(x == 0)
            return 0;
        else if(x % 5 == 0) {
            /*
                1.  FileNotFoundException() is a normal exception, which is unexpected, suppose this method is
                    receiving a file in which we want do perform something, but that file doesn't exist. Such scnerio
                    can't be handled by writing better code. So, we need to either handle it using try catch or throw
                    this to caller.
                2.  Also called as checked exception.
             */
            throw new FileNotFoundException();
        }
        else if(x % 3 == 0) {
            /*
                1.  ArithmeticException() is Runtime Exception, which can be handled by writing proper code,
                    so we don't need to throw this exception to caller.
                2.  These type of exception also called as unchecked exception.
             */
            throw new ArithmeticException();
        }
        else if(x % 2 == 0) {
            /*
                1. StudentNotFoundException() is a custom normal exception, that we have created
             */
            throw new StudentNotFoundException();
        }
        else if(x % 7 == 0) {
            /*
                1. StudentFileNotFoundException() is a custom runtime exception, that we have created
             */
            throw new StudentFileNotFoundException();
        }
        return 1 / x;
    }
}
