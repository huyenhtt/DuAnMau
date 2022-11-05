/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBan;

import java.sql.Connection;
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
public class SachRepo {

    public ArrayList<Sach> all() {
        ArrayList<Sach> listS = new ArrayList<>();
        try {
            Connection conn = JdbcUntil.getConnection();
            String sql = "select sach.id,sach.ten,so_luong,don_gia,tac_gia.ten as 'tebtg' from sach join tac_gia on tac_gia.id=sach.tac_gia_id";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {                
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                int so = rs.getInt("so_luong");
                double gia = rs.getDouble("don_gia");
                String tg = rs.getString("tebtg");
                Sach sach = new Sach(id, ten, so, gia, tg);
                listS.add(sach);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SachRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listS;
        
    }

    public void insert(Sach sach) {
        try {
            Connection conn = JdbcUntil.getConnection();
            String sql = "insert into sach "
                    + "(ten,so_luong,don_gia)" + " values(?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sach.getTen());
            ps.setInt(2, sach.getSo());
            ps.setDouble(3, sach.getGia());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SachRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void update(int id, Sach sach) {
        try {
            Connection conn = JdbcUntil.getConnection();
            String sql = "Update sach set ten=?,so_luong=?,don_gia=? where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sach.getTen());
            ps.setInt(2, sach.getSo());
            ps.setDouble(3, sach.getGia());
            ps.setInt(4, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SachRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void delete(int id) {
        try {
            Connection conn = JdbcUntil.getConnection();
            String sql = "delete from sach where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SachRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
