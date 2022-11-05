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
public class InsertDanhmuc {

    public static void main(String[] args) {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbUser = "sa", dbPass = "123456", dbUrl = "jdbc:sqlserver://localhost:1433"
                    + ";databaseName=su22b2_sof203";
            Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            System.out.println("ket noi thanh cong");
            DanhMuc danh = new DanhMuc(1, "tên 2", "sp1-giay dep", 0);
            String sql = "Insert into danh_muc " + "(ten,mo_ta,trang_thai)" + "Values(?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, danh.getTendm());
            ps.setString(2, danh.getMota());
            ps.setInt(3, danh.getTranhgThai());
            ps.execute();
            System.out.println("truy vấn thành công");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }}
