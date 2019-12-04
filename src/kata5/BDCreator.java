package kata5;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDCreator {

    public static void createDB(String name){
        String url = "jdbc:sqlite:" + name;
        try(Connection con = DriverManager.getConnection(url)){
            if(con != null){
                DatabaseMetaData meta = con.getMetaData();
                System.out.println("El driver es " + meta.getDriverName());
                System.out.println("Se ha creado una nueva BD");
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    } 
}
