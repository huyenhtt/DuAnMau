package javaapplication120;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class KhachHang implements Serializable{
    private String ten;
    private String loaive;
    private int soluong;
   private String gioitinh;

    public KhachHang() {
    }

    public KhachHang(String ten, String loaive, int soluong, String gioitinh) {
        this.ten = ten;
        this.loaive = loaive;
        this.soluong = soluong;
        this.gioitinh = gioitinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoaive() {
        return loaive;
    }

    public void setLoaive(String loaive) {
        this.loaive = loaive;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
   
   
}
