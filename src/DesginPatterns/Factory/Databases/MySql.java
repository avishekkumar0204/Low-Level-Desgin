package DesginPatterns.Factory.Databases;

import DesginPatterns.Factory.QueryLanguage.Sql;

public class MySql implements Database {
    public Sql createQuery(){
        return new Sql();
    }
}
