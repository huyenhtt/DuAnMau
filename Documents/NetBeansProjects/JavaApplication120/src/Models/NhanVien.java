/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class NhanVien {

    private String id;
    private String manv;
    private String honv;
    private String tenDem;
    private String tennv;
    private String gt;
    private Date ngaySinh;
    private String diachi;
    private String sdt;
    private String matkhau;
    private CuaHang cuaHang;
    private ChucVu chucVu;
    private int trangThai;

    public NhanVien() {
    }

    public NhanVien(String id, String manv, String honv, String tenDem, String tennv, String gt, Date ngaySinh, String diachi, String sdt, String matkhau, CuaHang cuaHang, ChucVu chucVu, int trangThai) {
        this.id = id;
        this.manv = manv;
        this.honv = honv;
        this.tenDem = tenDem;
        this.tennv = tennv;
        this.gt = gt;
        this.ngaySinh = ngaySinh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.matkhau = matkhau;
        this.cuaHang = cuaHang;
        this.chucVu = chucVu;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHonv() {
        return honv;
    }

    public void setHonv(String honv) {
        this.honv = honv;
    }

    public String getTenDem() {
        return tenDem;
    }

    public void setTenDem(String tenDem) {
        this.tenDem = tenDem;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public CuaHang getCuaHang() {
        return cuaHang;
    }

    public void setCuaHang(CuaHang cuaHang) {
        this.cuaHang = cuaHang;
    }

    public ChucVu getChucVu() {
        return chucVu;
    }

    public void setChucVu(ChucVu chucVu) {
        this.chucVu = chucVu;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

   
    @Override
    public String toString() {
        return  manv ;
    }

   
}
