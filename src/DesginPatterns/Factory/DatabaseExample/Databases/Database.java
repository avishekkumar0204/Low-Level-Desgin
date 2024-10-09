package DesginPatterns.Factory.DatabaseExample.Databases;

import DesginPatterns.Factory.DatabaseExample.Factories.DBFactory;

public interface Database {
    DBFactory createDBFactory();
}
