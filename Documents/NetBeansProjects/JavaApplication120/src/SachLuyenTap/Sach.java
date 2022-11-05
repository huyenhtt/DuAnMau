/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SachLuyenTap;

import java.sql.Date;




/**
 *
 * @author Admin
 */
public class Sach {
   
    private String ma;
    private String ten;
    private Date ngay;
    private int so;
    private double gia;
    private int tt;

    public Sach() {
    }

    public Sach(String ma, String ten, Date ngay, int so, double gia, int tt) {
        this.ma = ma;
        this.ten = ten;
        this.ngay = ngay;
        this.so = so;
        this.gia = gia;
        this.tt = tt;
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

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public int getSo() {
        return so;
    }

    public void setSo(int so) {
        this.so = so;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getTt() {
        return tt;
    }

    public void setTt(int tt) {
        this.tt = tt;
    }
    
}
