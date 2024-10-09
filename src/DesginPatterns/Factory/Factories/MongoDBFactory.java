package DesginPatterns.Factory.Factories;

import DesginPatterns.Factory.QueryLanguage.*;
import DesginPatterns.Factory.Transation.*;

public class MongoDBFactory implements DBFactory {
    public Query createQuery(){
        return new NoSql();
    }

    public Transation createTransation(){
        return new NoSqlTransation();
    }
}
