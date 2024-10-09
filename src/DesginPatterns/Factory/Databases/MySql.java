package DesginPatterns.Factory.Databases;

import DesginPatterns.Factory.Factories.DBFactory;
import DesginPatterns.Factory.Factories.MySqlFactory;

public class MySql implements Database {
    public DBFactory createDBFactory(){
        return new MySqlFactory();
    }
}
