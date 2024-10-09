package DesginPatterns.Factory;

import DesginPatterns.Factory.Databases.*;
import DesginPatterns.Factory.Factories.*;
import DesginPatterns.Factory.QueryLanguage.*;
import DesginPatterns.Factory.Transation.Transation;

public class UserService {
    public static void createUser(Database db){
        DBFactory dbf = db.createDBFactory();
        Query q = dbf.createQuery();
        q.executeQuery();
    }

    public static void createTransation(Database db){
        DBFactory dbf = db.createDBFactory();
        Transation t = dbf.createTransation();
        t.executeTransaction();
    }
}
