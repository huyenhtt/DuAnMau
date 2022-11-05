/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuyenTapXeMay;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class XeReps {

    public ArrayList<XeMay> all() {
        ArrayList<XeMay> listXM = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "Select * from XeMay";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                double gianhap = rs.getDouble("GiaNhap");
                double gaiban = rs.getDouble("GiaBan");
                int so = rs.getInt("SoLuong");
                XeMay xm = new XeMay(id, ma, ten, gianhap, gaiban, so);
                listXM.add(xm);
            }

        } catch (Exception ex) {
            Logger.getLogger(XeReps.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listXM;
    }
      public ArrayList<XeMay> getXe(String loaiXe) {
        ArrayList<XeMay> listXM = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "Select XeMay.Id,XeMay.Ma,XeMay.Ten,GiaNhap,GiaBan,SoLuong from XeMay join LoaiXM on XeMay.IdLXM=LoaiXM.Id where LoaiXM.Ten=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, loaiXe);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                double gianhap = rs.getDouble("GiaNhap");
                double gaiban = rs.getDouble("GiaBan");
                int so = rs.getInt("SoLuong");
                XeMay xm = new XeMay(id, ma, ten, gianhap, gaiban, so);
                listXM.add(xm);
            }

        } catch (Exception ex) {
            Logger.getLogger(XeReps.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listXM;
    }

    public void inssert(XeMay cm) {

        try {
            Connection conn = DBContext.getConnection();
            String sql = "Insert into XeMay " + "(Ma,Ten,GiaNhap,GiaBan,SoLuong)" + " Values(?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cm.getMa());
            ps.setString(2, cm.getTen());
            ps.setDouble(3, cm.getGianhap());
            ps.setDouble(4, cm.getGiaban());
            ps.setInt(5, cm.getSoluong());
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(XeReps.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void delete(String ma) {

        try {
            Connection conn = DBContext.getConnection();
            String sql = "Delete from XeMay Where Ma=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
           
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(XeReps.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public void update(String ma,XeMay cm) {

        try {
            Connection conn = DBContext.getConnection();
            String sql = "Update XeMay set Ten=?,GiaNhap=?,GiaBan=?,SoLuong=? Where Ma=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(5, ma);
            ps.setString(1, cm.getTen());
            ps.setDouble(2, cm.getGianhap());
            ps.setDouble(3, cm.getGiaban());
            ps.setInt(4, cm.getSoluong());
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(XeReps.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
}
