package DesginPatterns.Factory.DatabaseExample.Factories;

import DesginPatterns.Factory.DatabaseExample.QueryLanguage.*;
import DesginPatterns.Factory.DatabaseExample.Transation.*;

public class MySqlFactory implements DBFactory{
    public Query createQuery(){
        return new Sql();
    }
    public Transation createTransation(){
        return new SqlTransation();
    }

}
