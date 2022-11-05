/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuyenTapXeMay;

/**
 *
 * @author Admin
 */
public class XeMay {
   private String id;
   private String ma;
   private String ten;
   private double gianhap;
   private double giaban;
   private int soluong;

    public XeMay() {
    }

    public XeMay(String id, String ma, String ten, double gianhap, double giaban, int soluong) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.gianhap = gianhap;
        this.giaban = giaban;
        this.soluong = soluong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGianhap() {
        return gianhap;
    }

    public void setGianhap(double gianhap) {
        this.gianhap = gianhap;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
   
}
