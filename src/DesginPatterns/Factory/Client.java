package DesginPatterns.Factory;

import DesginPatterns.Factory.Databases.MongoDB;
import DesginPatterns.Factory.Databases.MySql;
import DesginPatterns.Factory.QueryLanguage.NoSql;

public class Client {
    public static void main(String[] args) {
        UserService.createUser(new MongoDB());
    }
}
