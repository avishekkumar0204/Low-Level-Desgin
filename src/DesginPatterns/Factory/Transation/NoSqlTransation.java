package DesginPatterns.Factory.Transation;

public class NoSqlTransation implements Transation {
    public void executeTransaction(){
        System.out.println("NoSql transaction executing...");
    }
}
