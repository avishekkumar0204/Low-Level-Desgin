package DesginPatterns.Factory;

import DesginPatterns.Factory.Databases.Database;
import DesginPatterns.Factory.Databases.MongoDB;
import DesginPatterns.Factory.Databases.MySql;
import DesginPatterns.Factory.QueryLanguage.NoSql;
import DesginPatterns.Factory.QueryLanguage.Query;
import DesginPatterns.Factory.QueryLanguage.Sql;

public class UserService {
    public static void createUser(Database db){
        Query q = db.createQuery();
        if(q != null) {
            q.execute();
        }
    }
}
