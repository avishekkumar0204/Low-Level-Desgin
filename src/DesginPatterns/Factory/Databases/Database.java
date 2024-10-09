package DesginPatterns.Factory.Databases;

import DesginPatterns.Factory.Factories.DBFactory;

public interface Database {
    DBFactory createDBFactory();
}
