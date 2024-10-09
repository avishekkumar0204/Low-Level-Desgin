package DesginPatterns.Factory.DatabaseExample;

import DesginPatterns.Factory.DatabaseExample.Databases.*;
import DesginPatterns.Factory.DatabaseExample.Factories.*;
import DesginPatterns.Factory.DatabaseExample.QueryLanguage.*;
import DesginPatterns.Factory.DatabaseExample.Transation.Transation;

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
