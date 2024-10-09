package DesginPatterns.Factory.Factories;

import DesginPatterns.Factory.QueryLanguage.*;
import DesginPatterns.Factory.Transation.*;

public class MySqlFactory implements DBFactory{
    public Query createQuery(){
        return new Sql();
    }
    public Transation createTransation(){
        return new SqlTransation();
    }

}
