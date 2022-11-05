/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Admin
 */
public class JdbcUntil {

    private static Connection conn;

    public static Connection getConnection() {
        if (JdbcUntil.conn == null) {
//            FINALASS_FPOLY_NET_JAVA_SM22_BL2
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dbUser = "sa", dbPass = "123456", dbUrl = "jdbc:sqlserver://localhost:1433" + ";databaseName=ql_sach_lt1";
                JdbcUntil.conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
                System.out.println("ket noi thanh cong ");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return conn;
    }
}
