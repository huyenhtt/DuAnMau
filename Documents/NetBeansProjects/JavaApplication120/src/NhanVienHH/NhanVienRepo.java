/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVienHH;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.ChucVu;
import models.CuaHang;

import models.NhanVien;

/**
 *
 * @author Admin
 */
public class NhanVienRepo {

    public ArrayList<NhanVien> all() {
        ArrayList<NhanVien> lissNV = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "Select NhanVien.Id,NhanVien.Ma,Ho,TenDem,NhanVien.Ten,GioiTinh,NgaySinh,NhanVien.DiaChi,Sdt,MatKhau,CuaHang.Id as'IdCuaHang',CuaHang.Ten as 'TenCH',ChucVu.Id as 'IdChucVu',ChucVu.Ten as 'TenCV',TrangThai from NhanVien left join CuaHang on CuaHang.Id=NhanVien.IdCH left join ChucVu on ChucVu.Id=NhanVien.IdCV";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ho = rs.getString("Ho");
                String tdem = rs.getString("TenDem");
                String ten = rs.getString("Ten");
                String gt = rs.getString("GioiTinh");
                Date ns = rs.getDate("NgaySinh");
                String dc = rs.getString("DiaChi");
                String sdt = rs.getString("Sdt");
                String mk = rs.getString("MatKhau");
                String tenCh = rs.getString("TenCH");
                String idCh = rs.getString("IdCuaHang");
                String idCV = rs.getString("IdChucVu");
                CuaHang cuaHang = new CuaHang();
                cuaHang.setId(idCh);
                cuaHang.setTen(tenCh);
                String tenCV = rs.getString("TenCV");
                ChucVu cv = new ChucVu();
                cv.setId(idCV);
                cv.setTen(tenCV);
                int tt = rs.getInt("TrangThai");
                NhanVien nv = new NhanVien(id, ma, ho, tdem, ten, gt, ns, dc, sdt, mk, cuaHang, cv, tt);
                lissNV.add(nv);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lissNV;
    }

    public void inssertkh(NhanVien nv) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "Insert into NhanVien " + "(Ma,Ho,TenDem,Ten,GioiTinh,NgaySinh,DiaChi,Sdt,MatKhau,IdCH,IdCV,TrangThai)" + " Values(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getManv());
            ps.setString(4, nv.getTennv());
            ps.setString(3, nv.getTenDem());
            ps.setString(2, nv.getHonv());
            ps.setString(5, nv.getGt());
            ps.setDate(6, nv.getNgaySinh());
            ps.setString(7, nv.getDiachi());
            ps.setString(8, nv.getSdt());
            ps.setString(9, nv.getMatkhau());
            String idCH = null;
            if (nv.getCuaHang() != null) {
                idCH = nv.getCuaHang().getId();
            }
            ps.setString(10, idCH);
            String idCV = null;
            if (nv.getChucVu() != null) {
                idCV = nv.getChucVu().getId();
            }
            ps.setString(11, idCV);
            ps.setInt(12, nv.getTrangThai());
//            ps.setString(11, nv.getTenCH());
//            ps.setString(12, nv.getChucVu());
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<NhanVien> getMAa() {
        ArrayList<NhanVien> lissNV = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "Select Ma from NhanVien";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {

                String ma = rs.getString("Ma");

                NhanVien nv = new NhanVien();
                nv.setManv(ma);
                lissNV.add(nv);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lissNV;
    }

    public void deletekk(String ma) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "Delete from NhanVien where Ma=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void updatekk(String ma, NhanVien nv) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "Update NhanVien set Ho=?,TenDem=?,Ten=?,GioiTinh=?,NgaySinh=?,DiaChi=?,Sdt=?,MatKhau=?,IdCH=?,IdCV=?,TrangThai=? where Ma=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(3, nv.getTennv());
            ps.setString(2, nv.getTenDem());
            ps.setString(1, nv.getHonv());
            ps.setString(4, nv.getGt());
            ps.setDate(5, nv.getNgaySinh());
            ps.setString(6, nv.getDiachi());
            ps.setString(7, nv.getSdt());
            ps.setString(8, nv.getMatkhau());
            String idCH = null;
            if (nv.getCuaHang() != null) {
                idCH = nv.getCuaHang().getId();
            }
            ps.setString(9, idCH);
             String idCV = null;
            if (nv.getChucVu() != null) {
                idCV = nv.getChucVu().getId();
            }
            ps.setString(10, idCV);
//            ps.setString(10, nv.getChucVu());
            ps.setInt(11, nv.getTrangThai());
//            ps.setString(10, nv.getTenCH());
//            ps.setString(11, nv.getChucVu());
            ps.setString(12, ma);
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public String checkMa(String ma) {
        String text = null;
        try {
            Connection conn = DBContext.getConnection();
            String sql = "select Ma from NhanVien where Ma=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                text = rs.getString("Ma");

            }
            return text;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
