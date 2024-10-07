package DesginPatterns.Builder.CustomExceptions;

public class IdNotValid extends RuntimeException{
    public IdNotValid(String message){
        super(message);
    }
}
