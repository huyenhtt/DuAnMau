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
public class NSX {
   private String idn;
   private String manxb;
   private String tennxb;

    public NSX() {
    }

    public NSX(String idn, String manxb, String tennxb) {
        this.idn = idn;
        this.manxb = manxb;
        this.tennxb = tennxb;
    }

    public String getIdn() {
        return idn;
    }

    public void setIdn(String idn) {
        this.idn = idn;
    }

    public String getManxb() {
        return manxb;
    }

    public void setManxb(String manxb) {
        this.manxb = manxb;
    }

    public String getTennxb() {
        return tennxb;
    }

    public void setTennxb(String tennxb) {
        this.tennxb = tennxb;
    }

    @Override
    public String toString() {
        return  tennxb ;
    }
   
}
