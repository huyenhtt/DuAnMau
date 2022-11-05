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
public class ChiTietHD {

    private HoaDon hdon;
    private ChiTietSP tensp;
    private int sl;
    private double dongia;

    public ChiTietHD() {
    }

    public HoaDon getHdon() {
        return hdon;
    }

    public ChiTietHD(HoaDon hdon, ChiTietSP tensp, int sl, double dongia) {
        this.hdon = hdon;
        this.tensp = tensp;
        this.sl = sl;
        this.dongia = dongia;
    }

    public ChiTietSP getTensp() {
        return tensp;
    }

    public void setTensp(ChiTietSP tensp) {
        this.tensp = tensp;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

  

}
