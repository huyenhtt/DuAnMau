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
public class SanPham {

    private String idsp;
    private String masp;
    private String tensp;

    public SanPham() {
    }

    public SanPham(String idsp, String masp, String tensp) {
        this.idsp = idsp;
        this.masp = masp;
        this.tensp = tensp;
    }

    public String getIdsp() {
        return idsp;
    }

    public void setIdsp(String idsp) {
        this.idsp = idsp;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    @Override
    public String toString() {
        return  tensp;
        
    }
    
}
