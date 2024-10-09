package DesginPatterns.Factory.DatabaseExample.Transation;

public class SqlTransation implements Transation {
    public void executeTransaction() {
        System.out.println("Sql transation executing...");
    }
}