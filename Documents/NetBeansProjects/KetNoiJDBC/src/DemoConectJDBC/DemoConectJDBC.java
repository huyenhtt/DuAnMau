/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoConectJDBC;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class DemoConectJDBC {

    public static void main(String[] args) {

        try {
            //driver :chuyển đổi 2 ngôn ngữ để có thể kết nối 2 ngôn ngữ
            //b1:load driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //b2:kết nối:  
            String dbUser = "sa", dbPass = "123456", dbUrl = "jdbc:sqlserver://localhost:1433"
                    + ";databaseName=su22b2_sof203";
            //chú ý : sai tên db hay ko

            Connection conn = DriverManager
                    .getConnection(dbUrl, dbUser, dbPass);
            System.out.println("Kết nối thành công");

            //chú ý : class java.sql tránh import sai
            //truy vấn thêm mới bản ghi
            //chú ý gtrị id là db tư sinh nên sẽ ko thêm id
            //SanPham sp=new SanPham();
            //Statement : tạo đối tượng truy ván
            //execute : thực thi
            //lưu ý bao nhiêu tham số bấy nhiêu dòng set, thứ tự và kiểu dl của tham số
            SanPham sp=new SanPham(0,"ao co tron","Black",10,10000,16);
            String sql="INSERT INTO san_pham"+"(ten,mau_sac,so_luong,don_gia,danh_muc_id)"+"VALUES(?,?,?,?,?)";
          //                                                                                       1 2 3 4 5
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, sp.getTen());
            ps.setString(2, sp.getMau());
            ps.setInt(3, sp.getSoluong());
            ps.setDouble(4, sp.getGia());
            ps.setInt(5, sp.getDanhmuc());
            ps.execute();
            System.out.println("truy vấn thành công");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
