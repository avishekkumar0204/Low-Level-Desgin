package DesginPatterns.Factory.DatabaseExample.Databases;

import DesginPatterns.Factory.DatabaseExample.Factories.DBFactory;
import DesginPatterns.Factory.DatabaseExample.Factories.MySqlFactory;

public class MySql implements Database {
    public DBFactory createDBFactory(){
        return new MySqlFactory();
    }
}
