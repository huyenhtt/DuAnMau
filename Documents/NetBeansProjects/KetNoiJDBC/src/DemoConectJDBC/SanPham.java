/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoConectJDBC;

/**
 *
 * @author Admin
 */
public class SanPham {
      private int id;
    private String ten;
    private String mau;
    private int soluong;
    private double gia;
    private int danhmuc;

    public SanPham() {
    }

    public SanPham(int id, String ten, String mau, int soluong, double gia, int danhmuc) {
        this.id = id;
        this.ten = ten;
        this.mau = mau;
        this.soluong = soluong;
        this.gia = gia;
        this.danhmuc = danhmuc;
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

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getDanhmuc() {
        return danhmuc;
    }

    public void setDanhmuc(int danhmuc) {
        this.danhmuc = danhmuc;
    }
    
    
}

