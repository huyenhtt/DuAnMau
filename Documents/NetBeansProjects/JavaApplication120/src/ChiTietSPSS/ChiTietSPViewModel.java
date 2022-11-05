/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChiTietSPSS;

import Models.DongSP;
import Models.MauSac;
import Models.NSX;
import Models.SanPham;

/**
 *
 * @author Admin
 */
public class ChiTietSPViewModel {
//lấy từ chi tiết sản phẩm
    private String id;
    private SanPham sp;
    private NSX nsx;
    private MauSac mau;
    private DongSP dong;
    private int nam;
    private String mota;
    private int slTon;
    private double giaBan;
    private double giaNhap;

    public ChiTietSPViewModel() {
    }

    public ChiTietSPViewModel(String id, SanPham sp, NSX nsx, MauSac mau, DongSP dong, int nam, String mota, int slTon, double giaBan, double giaNhap) {
        this.id = id;
        this.sp = sp;
        this.nsx = nsx;
        this.mau = mau;
        this.dong = dong;
        this.nam = nam;
        this.mota = mota;
        this.slTon = slTon;
        this.giaBan = giaBan;
        this.giaNhap = giaNhap;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SanPham getSp() {
        return sp;
    }

    public void setSp(SanPham sp) {
        this.sp = sp;
    }

    public NSX getNsx() {
        return nsx;
    }

    public void setNsx(NSX nsx) {
        this.nsx = nsx;
    }

    public MauSac getMau() {
        return mau;
    }

    public void setMau(MauSac mau) {
        this.mau = mau;
    }

    public DongSP getDong() {
        return dong;
    }

    public void setDong(DongSP dong) {
        this.dong = dong;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getSlTon() {
        return slTon;
    }

    public void setSlTon(int slTon) {
        this.slTon = slTon;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

}
