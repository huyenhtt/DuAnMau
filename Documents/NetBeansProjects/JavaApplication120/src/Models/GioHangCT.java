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
public class GioHangCT {

    private String idGH;
    private String idCTSP;
    private String maSP;
    private String tenSP;
    private int soluong;
    private double dongia;
    private double giagiam;

    public GioHangCT() {
    }

    public GioHangCT(String idGH, String idCTSP, String maSP, String tenSP, int soluong, double dongia, double giagiam) {
        this.idGH = idGH;
        this.idCTSP = idCTSP;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soluong = soluong;
        this.dongia = dongia;
        this.giagiam = giagiam;
    }

    public String getIdGH() {
        return idGH;
    }

    public void setIdGH(String idGH) {
        this.idGH = idGH;
    }

    public String getIdCTSP() {
        return idCTSP;
    }

    public void setIdCTSP(String idCTSP) {
        this.idCTSP = idCTSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getGiagiam() {
        return giagiam;
    }

    public void setGiagiam(double giagiam) {
        this.giagiam = giagiam;
    }

}
