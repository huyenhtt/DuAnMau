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
public class KhachHang {

    private String id;
    private String ma;
    private String tenkh;
    private String tendem;
    private String ho;
    private Date ngaysinh;
    private String sdt;
    private String dchi;
    private String tpho;
    private String qgia;
    private String mkhau;

    public KhachHang() {
    }

    public KhachHang(String id, String ma, String tenkh, String tendem, String ho, Date ngaysinh, String sdt, String dchi, String tpho, String qgia, String mkhau) {
        this.id = id;
        this.ma = ma;
        this.tenkh = tenkh;
        this.tendem = tendem;
        this.ho = ho;
        this.ngaysinh = ngaysinh;
        this.sdt = sdt;
        this.dchi = dchi;
        this.tpho = tpho;
        this.qgia = qgia;
        this.mkhau = mkhau;
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

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getTendem() {
        return tendem;
    }

    public void setTendem(String tendem) {
        this.tendem = tendem;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDchi() {
        return dchi;
    }

    public void setDchi(String dchi) {
        this.dchi = dchi;
    }

    public String getTpho() {
        return tpho;
    }

    public void setTpho(String tpho) {
        this.tpho = tpho;
    }

    public String getQgia() {
        return qgia;
    }

    public void setQgia(String qgia) {
        this.qgia = qgia;
    }

    public String getMkhau() {
        return mkhau;
    }

    public void setMkhau(String mkhau) {
        this.mkhau = mkhau;
    }

    @Override
    public String toString() {
        return  ma ;
    }

    

}
