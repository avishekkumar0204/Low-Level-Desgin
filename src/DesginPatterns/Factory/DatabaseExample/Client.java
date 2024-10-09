package DesginPatterns.Factory.DatabaseExample;

import DesginPatterns.Factory.DatabaseExample.Databases.Database;
import DesginPatterns.Factory.DatabaseExample.Databases.MongoDB;

public class Client {
    public static void main(String[] args) {
        Database db = new MongoDB();
        UserService.createUser(db);
        UserService.createTransation(db);

    }
}
