/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Admin
 */
public class ChiTietSP {

    private String id;
    private SanPham sp;
    private MauSac mau;
    private NSX nsx;
    private DongSP dongSP;
    private int namBH;
    private String mota;
    private int slTon;
    private double giaban;
    private double gianhap;

    public ChiTietSP() {
    }

    public ChiTietSP(String id, SanPham sp, MauSac mau, NSX nsx, DongSP dongSP, int namBH, String mota, int slTon, double giaban, double gianhap) {
        this.id = id;
        this.sp = sp;
        this.mau = mau;
        this.nsx = nsx;
        this.dongSP = dongSP;
        this.namBH = namBH;
        this.mota = mota;
        this.slTon = slTon;
        this.giaban = giaban;
        this.gianhap = gianhap;
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

    public MauSac getMau() {
        return mau;
    }

    public void setMau(MauSac mau) {
        this.mau = mau;
    }

    public NSX getNsx() {
        return nsx;
    }

    public void setNsx(NSX nsx) {
        this.nsx = nsx;
    }

    public DongSP getDongSP() {
        return dongSP;
    }

    public void setDongSP(DongSP dongSP) {
        this.dongSP = dongSP;
    }

    public int getNamBH() {
        return namBH;
    }

    public void setNamBH(int namBH) {
        this.namBH = namBH;
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

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public double getGianhap() {
        return gianhap;
    }

    public void setGianhap(double gianhap) {
        this.gianhap = gianhap;
    }

    @Override
    public String toString() {
        return id;
    }

}
