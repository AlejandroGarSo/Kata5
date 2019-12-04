package kata5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TableInserter {
    
    public void insert(String email, String bd, String table){
        String sql = "INSERT INTO "+ table +"(direccion) VALUES(?)";
        
        try (Connection con = DBConnector.connect(bd);
            PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, email);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

}
