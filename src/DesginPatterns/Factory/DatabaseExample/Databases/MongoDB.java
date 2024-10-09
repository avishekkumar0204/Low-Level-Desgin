package DesginPatterns.Factory.DatabaseExample.Databases;


import DesginPatterns.Factory.DatabaseExample.Factories.DBFactory;
import DesginPatterns.Factory.DatabaseExample.Factories.MongoDBFactory;

public class MongoDB implements Database {
    public DBFactory createDBFactory(){
        return new MongoDBFactory();
    }
}
