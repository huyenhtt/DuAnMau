/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoConectJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class SelectSP {

    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbUser = "sa", dbPass = "123456", dbUrl = "jdbc:sqlserver://localhost:1433" + ";databaseName=su22b2_sof203";
            Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            System.out.println("kết nối thành công");
            ArrayList<SanPham> listSp = new ArrayList<>();

            //doi tuong dc lay ra nho resultset,toàn bộ gtrị trả về réultset
            //next() ktra xem dl còn để lặp ko/đọc dl
            String sql = "Select * from san_pham  ";
            PreparedStatement pre = conn.prepareStatement(sql);
//            pre.setString(1, "ten");

            pre.execute();
            ResultSet rs = pre.getResultSet();
            while (rs.next()) {
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                String mausac = rs.getString("mau_sac");
                int sol = rs.getInt("so_luong");
                double dongia = rs.getDouble("don_gia");
                int danhmuc = rs.getInt("danh_muc_id");//tên cột trong db
                SanPham sp = new SanPham(id, ten, mausac, sol, dongia, danhmuc);
                listSp.add(sp);
               System.out.println(sp.getId()+"/"+sp.getTen()+"/"+sp.getMau()+"/"+sp.getSoluong()+"/"+sp.getGia()+"/"+sp.getDanhmuc());
            }
//            for (SanPham sanPham : listSp) {
//                System.out.println(sanPham.getId()+"/"+sanPham.getTen()+"/"+sanPham.getMau()+"/"+sanPham.getSoluong()+"/"+sanPham.getGia()+"/"+sanPham.getDanhmuc());
//            }
            System.out.println("truy van thanh cong");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
