package Singleton;

import javax.xml.crypto.Data;

public class DatabaseConnection {
    private String username;
    private String password;
    private static DatabaseConnection dbc = null;
    private DatabaseConnection() {};

    public static DatabaseConnection getInstance(){
        if(dbc == null){
            dbc = new DatabaseConnection();
        }
        return dbc;
    }
}
