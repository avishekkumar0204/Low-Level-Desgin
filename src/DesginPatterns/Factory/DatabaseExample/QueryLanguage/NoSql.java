package DesginPatterns.Factory.DatabaseExample.QueryLanguage;

public class NoSql implements Query {
    public void executeQuery(){
        System.out.println("NoSql query executing...");
    }
}
