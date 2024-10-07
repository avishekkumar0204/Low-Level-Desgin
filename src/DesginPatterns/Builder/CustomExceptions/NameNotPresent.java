package DesginPatterns.Builder.CustomExceptions;

public class NameNotPresent extends RuntimeException{
    public NameNotPresent(String message){
        super(message);
    }
}
