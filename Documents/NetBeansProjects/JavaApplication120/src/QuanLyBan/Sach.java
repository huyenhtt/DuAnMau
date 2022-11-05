/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBan;

/**
 *
 * @author Admin
 */
public class Sach {
    private int id;
    private String ten;
    private int so;
    private double gia;
    private String tentg;

    public Sach() {
    }

    public Sach(int id, String ten, int so, double gia, String tentg) {
        this.id = id;
        this.ten = ten;
        this.so = so;
        this.gia = gia;
        this.tentg = tentg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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

    public String getTentg() {
        return tentg;
    }

    public void setTentg(String tentg) {
        this.tentg = tentg;
    }
    
}
