/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hahaChi;

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
public class HoaDonRepo {

    public ArrayList<HoaDon> all() {
        ArrayList<HoaDon> liskh = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "select * from HoaDon";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                Date nt = rs.getDate("NgayTao");
                Date ntt = rs.getDate("NgayThanhToan");
                Date nship = rs.getDate("NgayShip");
                Date ngays = rs.getDate("NgayNhan");
                int tt = rs.getInt("TinhTrang");
                String ten = rs.getString("TenNguoiNhan");
                String dc = rs.getString("DiaChi");
                String sdt = rs.getString("Sdt");
                HoaDon kh = new HoaDon(id, ma, nt, ntt, nship, ngays, tt, ten, dc, sdt);
                liskh.add(kh);
            }
        } catch (Exception ex) {
            Logger.getLogger(KhachHangRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return liskh;
    }

    public void inssertkh(HoaDon kh) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "Insert into HoaDon " + "(Ma,NgayTao,NgayThanhToan,NgayShip,NgayNhan,TinhTrang,TenNguoiNhan,DiaChi,Sdt)" + " Values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, kh.getMahd());
            ps.setDate(2, kh.getNgayTao());
            ps.setDate(3, kh.getNgayTt());
            ps.setDate(4, kh.getNgayShip());
            ps.setDate(5, kh.getNgayNhan());

            ps.setInt(6, kh.getTt());

            ps.setString(7, kh.getTen());
            ps.setString(8, kh.getDchi());
            ps.setString(9, kh.getSdt());
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(KhachHangRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deletekk(String ma) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "Delete from HoaDon where Ma=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(KhachHangRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updatekk(String ma, HoaDon kh) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "Update HoaDon set NgayTao=?,NgayThanhToan=?,NgayShip=?,NgayNhan=?,TinhTrang=?,TenNguoiNhan=?,DiaChi=?,Sdt=? where Ma=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setDate(1, kh.getNgayTao());
            ps.setDate(2, kh.getNgayTt());
            ps.setDate(3, kh.getNgayShip());
            ps.setDate(4, kh.getNgayNhan());
            ps.setInt(5, kh.getTt());
            ps.setString(6, kh.getTen());
            ps.setString(7, kh.getDchi());
            ps.setString(8, kh.getSdt());
            ps.setString(9, ma);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(KhachHangRepo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String checkMa(String ma) {
        String text = null;
        try {
            Connection conn = DBContext.getConnection();
            String sql = "select Ma from HoaDon where Ma=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                text = rs.getString("Ma");

            }
            return text;
        } catch (Exception ex) {
            Logger.getLogger(ChucVuRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
