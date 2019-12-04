package kata5;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectApp {

    public void selectAll(String bd, String table) {
        String sql = "select * from " + table;
        try{
            Connection con = DBConnector.connect(bd);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.print(rs.getInt("ID"));
                System.out.println(" "+rs.getString("direccion"));
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
