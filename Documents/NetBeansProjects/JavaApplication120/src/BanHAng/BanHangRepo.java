/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BanHAng;

import Models.ChiTietHD;
import Models.ChiTietSP;
import Models.NhanVien;
import Utilities.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Models.SanPham;
import Repositories.impls.IBanHangR;
import ViewModels.HoaDonBH;
import java.sql.Date;

/**
 *
 * @author Admin
 */
public class BanHangRepo implements IBanHangR {
//fill bảng chi tiết sản phẩmamrf

    @Override
    public List<ChiTietSP> getSPham() {
        List<ChiTietSP> lisstSP = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "select SanPham.Ma,Ten,year(NgayThanhToan) as 'Nam BH',MoTa,SoLuongTon,GiaNhap,GiaBan from  ChiTietSP join SanPham on SanPham.Id=ChiTietSP.IdSP join HoaDonChiTiet on HoaDonChiTiet.IdChiTietSP=ChiTietSP.Id join HoaDon on HoaDon.Id=HoaDonChiTiet.IdHoaDon";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();

            while (rs.next()) {
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                SanPham sp = new SanPham();
                sp.setMasp(ma);
                sp.setTensp(ten);
                int nam = rs.getInt("Nam BH");
                String mota = rs.getString("MoTa");
                int slTon = rs.getInt("SoLuongTon");
                double gianhap = rs.getDouble("GiaNhap");
                double giaB = rs.getDouble("GiaBan");
                ChiTietSP ban = new ChiTietSP();
                ban.setSp(sp);
                ban.setMota(mota);
                ban.setNamBH(nam);
                ban.setGianhap(gianhap);
                ban.setGiaban(giaB);
                ban.setSlTon(slTon);
                lisstSP.add(ban);
            }
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return lisstSP;

    }

    @Override
    public Integer updateSP(ChiTietSP bh, String id) {
        Integer kq = -1;
        try {
            Connection conn = DBContext.getConnection();
            String sql = "Update ChiTietSP Set SoLuongTon=? Where Id=? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, bh.getSlTon());
            ps.setString(2, id);
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            kq = -1;
        }

        return kq;
    }

    @Override
    public List<ChiTietHD> allGioHang() {
        List<ChiTietHD> list = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                int sl = rs.getInt("SoLuongHD");
                double gia = rs.getDouble("DonGia");
//                tổng tiền trên jframe sẽ đc tính như nào 
                ChiTietHD ct = new ChiTietHD();
                ct.setSl(sl);
                ct.setDongia(gia);
                list.add(ct);
            }
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return list;
    }
//fill table hoá đơn

    @Override
    public List<HoaDonBH> all() {
        List<HoaDonBH> lisst = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "Select hd.Ma,NgayTao,nv.Ten as 'TenNV',TinhTrang From HoaDon hd join NhanVien nv on nv.Id=hd.IdNV ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();

            while (rs.next()) {
                String ma = rs.getString("Ma");
                Date ngaytao = rs.getDate("NgayTao");
                String ten = rs.getString("TenNV");
                NhanVien nv = new NhanVien();
                nv.setTennv(ten);
                int tt = rs.getInt("TinhTrang");
                HoaDonBH bh = new HoaDonBH(ma, ngaytao, nv, tt);
                lisst.add(bh);

            }
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return lisst;
    }

    //tìm mã hoá đơn fill lên bảng hoá đơn chi tiết 
    public List<HoaDonBH> findMa(String ma) {
        List<HoaDonBH> listBH = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "Select hd.Ma,NgayTao,nv.Ten as 'TenNV',TinhTrang From HoaDon hd join NhanVien nv on nv.Id=hd.IdNV where hd.Ma=? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ps.execute();
            ResultSet rs = ps.getResultSet();

            while (rs.next()) {
                String mach = rs.getString(ma);
                Date ngaytao = rs.getDate("NgayTao");
                String ten = rs.getString("TenNV");
                NhanVien nv = new NhanVien();
                nv.setTennv(ten);
                int tt = rs.getInt("TinhTrang");
                HoaDonBH bh = new HoaDonBH(ma, ngaytao, nv, tt);
                listBH.add(bh);

            }
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return listBH;

    }

    @Override
    public void updateBh(HoaDonBH bh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer insertGHang(ChiTietHD ct) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
