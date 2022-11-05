/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChiTietSPSS;

/**
 *
 * @author Admin
 */
public class ChiTietSP {

    private String id;
    private String tensp;
    private String mau;
    private String nsx;
    private String dongSP;
    private int namBH;
    private String mota;
    private int slTon;
    private double giaban;
    private double gianhap;

    public ChiTietSP() {
    }

    public ChiTietSP(String id, String tensp, String mau, String nsx, String dongSP, int namBH, String mota, int slTon, double giaban, double gianhap) {
        this.id = id;
        this.tensp = tensp;
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

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getNsx() {
        return nsx;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }

    public String getDongSP() {
        return dongSP;
    }

    public void setDongSP(String dongSP) {
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

}