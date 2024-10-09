package DesginPatterns.Factory.QueryLanguage;

public class Sql implements Query {
    public void execute(){
        System.out.println("SQL query executing...");
    }
}
