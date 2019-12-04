package kata5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreator {
    
    public static void createTable(String db, String name){
        
        String url = "jdbc:sqlite:" + db;
        
        String sql = "CREATE TABLE IF NOT EXISTS "+ name +" (\n"
            + " id integer PRIMARY KEY AUTOINCREMENT,\n"
            + " direccion text NOT NULL);";
        try(Connection con = DriverManager.getConnection(url)){
            if(con != null){
                Statement stmt = con.createStatement();
                stmt.execute(sql);
                System.out.println("Tabla creada");
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

}
