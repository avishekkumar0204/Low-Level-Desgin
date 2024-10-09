package DesginPatterns.Factory.DatabaseExample.Factories;

import DesginPatterns.Factory.DatabaseExample.QueryLanguage.*;
import DesginPatterns.Factory.DatabaseExample.Transation.*;

public class MongoDBFactory implements DBFactory {
    public Query createQuery(){
        return new NoSql();
    }

    public Transation createTransation(){
        return new NoSqlTransation();
    }
}
