package DesginPatterns.Factory;

import DesginPatterns.Factory.Databases.MongoDB;
import DesginPatterns.Factory.Databases.MySql;
import DesginPatterns.Factory.QueryLanguage.NoSql;
import DesginPatterns.Factory.QueryLanguage.Sql;

public class Client {
    public static void main(String[] args) {
        UserService.createUser(new MySql());
    }
}
