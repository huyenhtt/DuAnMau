/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhMucSP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class UpateDM {
    public static void main(String[] args) {
        
      
                     try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbUser="sa",dbPass="123456",dbUrl="jdbc:sqlserver://localhost:1433"+";databaseName=su22b2_sof203";
            Connection conn=DriverManager.getConnection(dbUrl, dbUser, dbPass);
            System.out.println("ket noi thanh cong");
            String sql="Update danh_muc set ten=? ,mo_ta=?,trang_thai=? where id=?";
            
            PreparedStatement ps=conn.prepareStatement(sql);
           ps.setString(1, "Ao dai tay");
           ps.setString(2, "Ao");
           ps.setInt(3, 1);
           ps.setInt(4, 5);
            ps.executeUpdate();
            System.out.println("update thanh cong!");
        } catch (ClassNotFoundException e) {
           e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();

    }}

}
