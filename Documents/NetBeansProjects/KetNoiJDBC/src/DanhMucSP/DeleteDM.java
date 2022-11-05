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


/**
 *
 * @author Admin
 */
public class DeleteDM {

    public static void main(String[] args) {
        try {
            //        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String dbUser="sa",dbPass="123456",dbUrl="jdbc:sqlserver://localhost:1433"+";databaseName=su22b2_sof203";
//            Connection conn=DriverManager.getConnection(dbUrl, dbUser, dbPass);
//            System.out.println("ket noi thanh cong");
//            String sql="Delete from danh_muc Where id=?";
//            PreparedStatement ps=conn.prepareStatement(sql);
//            ps.setInt(1, 4);
//            ps.executeUpdate();
//            System.out.println("xoa thanh cong!");
//        } catch (ClassNotFoundException e) {
//           e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//                    
//        }
//cuoi tuan cham assment 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbUser = "sa", dbPass = "123456", dbUrl = "jdbc:sqlserver://localhost:1433" + ";databaseName=su22b2_sof203";
            Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            System.out.println("ket noi thanh cong");
            String sql ="Delete from danh_muc Where id=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1, 8);
            ps.executeUpdate();
            System.out.println("xoa thanh cong");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
