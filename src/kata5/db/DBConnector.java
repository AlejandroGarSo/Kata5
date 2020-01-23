package kata5.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    
    public static Connection connect(String name){
        String url = "jdbc:sqlite:" + name;
        Connection con = null;
        try {
            con = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
