/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhMucSP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class SelectDanhMuc {

    public static void main(String[] args) {
        try {
            //        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String dbUser = "sa", dbPass = "123456", dbUrl = "jdbc:sqlserver://localhost:1433" + ";databaseName=su22b2_sof203";
//            Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
//            System.out.println("ket noi thanh cong");
//            ArrayList<DanhMuc> lisstDanh = new ArrayList<>();
//            String sql = "Select * from danh_muc";
//            PreparedStatement ps = conn.prepareStatement(sql);
//            
//            ps.execute();
//            ResultSet rs = ps.getResultSet();
//            while (rs.next()) {                
//                int id = rs.getInt("id");
//                String ten = rs.getString("ten");
//                String mota = rs.getString("mo_ta");
//                int tranhthai = rs.getInt("trang_thai");
//                DanhMuc danhmuc = new DanhMuc(id, ten, mota, tranhthai);
//                lisstDanh.add(danhmuc);
//                
//            }
//            System.out.println("truy van thanh cong!");
//            for (DanhMuc danhMuc : lisstDanh) {
//                System.out.println(danhMuc.getId()+"/"+danhMuc.getTendm()+"/"+danhMuc.getMota()+"/"+danhMuc.getTranhgThai());
//            }
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            
//        }
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
String dbUser="sa",dbPass="123456",dbUrl="jdbc:sqlserver://localhost:1433"+";databaseName=su22b2_sof203";
Connection conn=DriverManager.getConnection(dbUrl, dbUser, dbPass);
            System.out.println("ket noi thanh cong");
            String sql="Select * from danh_muc ";
            ArrayList<DanhMuc> lisstd=new ArrayList<>();
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs=ps.getResultSet();
            while (rs.next()) {                
                int id=rs.getInt("id");
                String ten=rs.getString("ten");
                String mota=rs.getString("mo_ta");
                int tinhtrang=rs.getInt("trang_thai");
                DanhMuc dm=new DanhMuc(id,ten,mota,tinhtrang);
                lisstd.add(dm);
//                System.out.println(dm.getId()+"/"+dm.getTendm()+"/"+dm.getMota()+"/"+dm.getTranhgThai());
            }
        } catch (ClassNotFoundException e) {
e.printStackTrace();        } catch (SQLException e) {
e.printStackTrace();        }
    }
}
