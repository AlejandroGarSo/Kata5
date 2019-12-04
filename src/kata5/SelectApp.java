package kata5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectApp {

    private  Connection connect(String name){
        String url = "jdbc:sqlite:" + name;
        Connection con = null;
        try {
            con = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }

    public void selectAll(String bd, String table) {
        String sql = "select * from " + table;
        try{
            Connection con = this.connect(bd);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.print(rs.getInt("ID"));
                System.out.println(" "+rs.getString("name"));
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
