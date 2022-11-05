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
public class DeleteSP {

    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbUser = "sa", dbPass = "123456", dbUrl = "jdbc:sqlserver://localhost:1433"
                    + ";databaseName=su22b2_sof203";

            Connection conn = DriverManager
                    .getConnection(dbUrl, dbUser, dbPass);
            System.out.println("Kết nối thành công");
            String sql="Delete from san_pham Where id=?";
            PreparedStatement pre=conn.prepareStatement(sql);
            pre.setInt(1, 9);
            pre.executeUpdate();
            System.out.println("xoa thanh cong!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
