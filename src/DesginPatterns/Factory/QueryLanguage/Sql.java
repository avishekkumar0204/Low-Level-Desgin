package DesginPatterns.Factory.QueryLanguage;

public class Sql implements Query {
    public void executeQuery(){
        System.out.println("Sql query executing...");
    }
}
