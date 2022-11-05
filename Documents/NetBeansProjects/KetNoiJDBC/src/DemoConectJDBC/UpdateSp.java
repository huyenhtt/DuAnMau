/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoConectJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class UpdateSp {

    public static void main(String[] args) {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbUser = "sa", dbPass = "123456", dbUrl = "jdbc:sqlserver://localhost:1433"
                    + ";databaseName=su22b2_sof203";

            Connection conn = DriverManager
                    .getConnection(dbUrl, dbUser, dbPass);
            System.out.println("Kết nối thành công");
            String sql = "Update san_pham set ten=? ,mau_sac=?,so_luong=?,don_gia=?,danh_muc_id=? Where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(6, 7);
            ps.setString(1, "Ao len");
            ps.setString(2, "Red");
            ps.setInt(3, 5);
            ps.setDouble(4, 970000);
            ps.setInt(5, 7);

            ps.executeUpdate();
            System.out.println("cap nhat thanh cong !");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
