/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SachLuyenTap;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class SachRepo {

    public ArrayList<Sach> all() {
        ArrayList<Sach> lisS = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "Select * from Sach";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                Date ngay = rs.getDate("NgayXuatBan");
                int so = rs.getInt("SoTrang");
                double gia = rs.getDouble("DonGia");
                int tt = rs.getInt("TrangThai");
                Sach ss = new Sach(ma, ten, ngay, so, gia, tt);
                lisS.add(ss);
            }

        } catch (Exception ex) {
            Logger.getLogger(SachRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lisS;
    }

    public void inserrt(Sach s) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "Insert into Sach " + "(Ma,Ten,NgayXuatBan,SoTrang,DonGia,TrangThai)" + " values(?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getMa());
            ps.setString(2, s.getTen());
            ps.setDate(3, s.getNgay());
            ps.setInt(4, s.getSo());
            ps.setDouble(5, s.getGia());
            ps.setInt(6, s.getTt());
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(SachRepo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
 public Sach search(String ma) {
     Sach s=null;
        try {
            Connection conn = DBContext.getConnection();
            String sql = "Select * from Sach Where Ma=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,ma);
            
            ps.execute();
            ResultSet rs=ps.getResultSet();
            while (rs.next()) {                
//                 String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                Date ngay = rs.getDate("NgayXuatBan");
                int so = rs.getInt("SoTrang");
                double gia = rs.getDouble("DonGia");
                int tt = rs.getInt("TrangThai");
                s=new Sach(ma, ten, ngay, so, gia, tt);
            }
            return s;
        } catch (Exception ex) {
            Logger.getLogger(SachRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
return null;
    }
}
