/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class HoaDon {

    private String id;
    private String mahd;
    private Date ngayTao;
    private Date ngayTt;
    private Date ngayShip;
    private Date ngayNhan;
    private int tt;
    private String ten;
    private String dchi;
    private String sdt;

    public HoaDon() {
    }

    public HoaDon(String id, String mahd, Date ngayTao, Date ngayTt, Date ngayShip, Date ngayNhan, int tt, String ten, String dchi, String sdt) {
        this.id = id;
        this.mahd = mahd;
        this.ngayTao = ngayTao;
        this.ngayTt = ngayTt;
        this.ngayShip = ngayShip;
        this.ngayNhan = ngayNhan;
        this.tt = tt;
        this.ten = ten;
        this.dchi = dchi;
        this.sdt = sdt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayTt() {
        return ngayTt;
    }

    public void setNgayTt(Date ngayTt) {
        this.ngayTt = ngayTt;
    }

    public Date getNgayShip() {
        return ngayShip;
    }

    public void setNgayShip(Date ngayShip) {
        this.ngayShip = ngayShip;
    }

    public Date getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(Date ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public int getTt() {
        return tt;
    }

    public void setTt(int tt) {
        this.tt = tt;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDchi() {
        return dchi;
    }

    public void setDchi(String dchi) {
        this.dchi = dchi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return mahd;
    }

}
