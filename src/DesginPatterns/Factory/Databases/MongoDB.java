package DesginPatterns.Factory.Databases;


import DesginPatterns.Factory.Factories.DBFactory;
import DesginPatterns.Factory.Factories.MongoDBFactory;

public class MongoDB implements Database {
    public DBFactory createDBFactory(){
        return new MongoDBFactory();
    }
}
