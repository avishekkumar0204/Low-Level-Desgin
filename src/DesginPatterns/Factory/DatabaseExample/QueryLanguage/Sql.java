package DesginPatterns.Factory.DatabaseExample.QueryLanguage;

public class Sql implements Query {
    public void executeQuery(){
        System.out.println("Sql query executing...");
    }
}
