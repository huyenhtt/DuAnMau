/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class GioHang {

    private String id;
    private KhachHang khach;
    private NhanVien nhanVien;
    private String maGH;
    private Date ngayTao;
    private Date ngayTT;
    private String tenNguoiNhan;
    private String dChi;
    private String sdt;
    private int tt;

    public GioHang() {
    }

    public GioHang(String id, KhachHang khach, NhanVien nhanVien, String maGH, Date ngayTao, Date ngayTT, String tenNguoiNhan, String dChi, String sdt, int tt) {
        this.id = id;
        this.khach = khach;
        this.nhanVien = nhanVien;
        this.maGH = maGH;
        this.ngayTao = ngayTao;
        this.ngayTT = ngayTT;
        this.tenNguoiNhan = tenNguoiNhan;
        this.dChi = dChi;
        this.sdt = sdt;
        this.tt = tt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public KhachHang getKhach() {
        return khach;
    }

    public void setKhach(KhachHang khach) {
        this.khach = khach;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public String getMaGH() {
        return maGH;
    }

    public void setMaGH(String maGH) {
        this.maGH = maGH;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayTT() {
        return ngayTT;
    }

    public void setNgayTT(Date ngayTT) {
        this.ngayTT = ngayTT;
    }

    public String getTenNguoiNhan() {
        return tenNguoiNhan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        this.tenNguoiNhan = tenNguoiNhan;
    }

    public String getdChi() {
        return dChi;
    }

    public void setdChi(String dChi) {
        this.dChi = dChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getTt() {
        return tt;
    }

    public void setTt(int tt) {
        this.tt = tt;
    }

    
}
