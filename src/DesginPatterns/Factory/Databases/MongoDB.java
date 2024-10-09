package DesginPatterns.Factory.Databases;

import DesginPatterns.Factory.QueryLanguage.NoSql;
import DesginPatterns.Factory.QueryLanguage.Query;

public class MongoDB implements Database {
    public Query createQuery(){
        return new NoSql();
    }
}
