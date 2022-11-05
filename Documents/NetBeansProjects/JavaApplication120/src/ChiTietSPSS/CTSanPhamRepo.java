/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChiTietSPSS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.BanHangM;
import models.ChiTietSP;
import models.DongSP;
import models.MauSac;
import models.NSX;
import models.SanPham;

/**
 *
 * @author Admin
 */
public class CTSanPhamRepo {

    public ArrayList<ChiTietSP> all() {
        ArrayList<ChiTietSP> liskh = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "select ChiTietSP.Id,SanPham.Ten as 'TenSP',MauSac.Ten as 'MauSac',NSX.Ten as 'TenNSX',DongSP.Ten as 'DongSP',NamBH,MoTa,SoLuongTon,GiaNhap,GiaBan  from ChiTietSP left join SanPham  on SanPham.Id=ChiTietSP.IdSP left join MauSac  on MauSac.Id=ChiTietSP.IdMauSac left join NSX on NSX.Id=ChiTietSP.IdNsx left join DongSP on DongSP.Id=ChiTietSP.IdDongSP";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("Id");
                String ten = rs.getString("TenSP");
                String mau = rs.getString("MauSac");
                String nsx = rs.getString("TenNSX");
                String dongsp = rs.getString("DongSP");
                int nambh = rs.getInt("NamBH");
                String mota = rs.getString("MoTa");
                int slTon = rs.getInt("SoLuongTon");
                double gianhap = rs.getDouble("GiaNhap");
                double giaBan = rs.getDouble("GiaBan");
                ChiTietSP ct = new ChiTietSP(id, ten, mau, nsx, dongsp, nambh, mota, slTon, giaBan, gianhap);
                liskh.add(ct);
            }
        } catch (Exception ex) {
            Logger.getLogger(KhachHangRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return liskh;
    }
      public List<BanHangM> getSPham() {
        List<BanHangM> lisstSP = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "select ChiTietSP.Id,SanPham.Ma as 'Ma SP',SanPham.Ten as 'TenSP',MauSac.Ma as 'Ma mau',MauSac.Ten as 'MauSac',NSX.Ma as 'Ma NSX',NSX.Ten as 'TenNSX',DongSP.Ma as 'Ma DSP',DongSP.Ten as 'DongSP',NamBH,MoTa,SoLuongTon,GiaNhap,GiaBan  from ChiTietSP left join SanPham  on SanPham.Id=ChiTietSP.IdSP left join MauSac  on MauSac.Id=ChiTietSP.IdMauSac left join NSX on NSX.Id=ChiTietSP.IdNsx left join DongSP on DongSP.Id=ChiTietSP.IdDongSP";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
  while (rs.next()) {
                String id = rs.getString("Id");
                String ten = rs.getString("TenSP");
                String mau = rs.getString("MauSac");
                String maM=rs.getString("Ma mau");
                MauSac ms=new MauSac();
                ms.setTen(mau);
                String maSP=rs.getString("Ma SP");
                SanPham sp=new SanPham();
                sp.setTensp(ten);
                sp.setMasp(maSP);
                String nsx = rs.getString("TenNSX");
                String maNSX=rs.getString("Ma NSX");
                NSX nxsA=new NSX();
                nxsA.setManxb(maNSX);
                nxsA.setTennxb(nsx);
                String dongsp = rs.getString("DongSP");
                String maD=rs.getString("Ma DSP");
                DongSP spD=new DongSP();
                spD.setMaD(maD);
                spD.setTenD(dongsp);
                int nambh = rs.getInt("NamBH");
                String mota = rs.getString("MoTa");
                int slTon = rs.getInt("SoLuongTon");
                double gianhap = rs.getDouble("GiaNhap");
                double giaBan = rs.getDouble("GiaBan");
                BanHangM ct = new BanHangM(id, sp, nxsA, ms, spD, nambh, mota, slTon, giaBan, gianhap);
                lisstSP.add(ct);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lisstSP;

    }
    public void inssertkh(ChiTietSP ctSP) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "Insert into ChiTietSP " + "(NamBH,MoTa,SoLuongTon,GiaNhap,GiaBan)" + " Values(?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, ctSP.getNamBH());
            ps.setString(2, ctSP.getMota());
            ps.setInt(3, ctSP.getSlTon());
            ps.setDouble(4, ctSP.getGianhap());
            ps.setDouble(5, ctSP.getGiaban());
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(KhachHangRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deletekk(String id) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "Delete from ChiTietSP where Id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(KhachHangRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updatekk(String id, ChiTietSP ctSp) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "Update ChiTietSP set NamBH=?,MoTa=?,SoLuongTon=?,GiaNhap=?,GiaBan=? where Id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, ctSp.getNamBH());
            ps.setString(2, ctSp.getMota());
            ps.setInt(3, ctSp.getSlTon());
            ps.setDouble(4, ctSp.getGianhap());
            ps.setDouble(5, ctSp.getGiaban());
            ps.setString(6, id);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(KhachHangRepo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
