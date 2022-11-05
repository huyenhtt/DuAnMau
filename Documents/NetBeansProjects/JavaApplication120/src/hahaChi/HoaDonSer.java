/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hahaChi;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HoaDonSer {

    private HoaDonRepo repo;

    public HoaDonSer() {
        this.repo = new HoaDonRepo();
    }

    public ArrayList<HoaDon> getList() {
        return this.repo.all();
    }

    public void insertkk(HoaDon kh) {

        this.repo.inssertkh(kh);
    }

    public void deletekh(String ma) {
        this.repo.deletekk(ma);
    }

    public String checkMA(String ma) {
        return this.repo.checkMa(ma);
    }

    public void updatekhk(String ma, HoaDon kh) {
        this.repo.updatekk(ma, kh);
    }
}
