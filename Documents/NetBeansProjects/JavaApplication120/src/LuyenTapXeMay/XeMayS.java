/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuyenTapXeMay;

import java.util.ArrayList;


/**
 *
 * @author Admin
 */
public class XeMayS {

    private XeReps repo;

    public XeMayS() {
        this.repo = new XeReps();
    }

    public ArrayList<XeMay> getList() {
        return this.repo.all();
    }
    public ArrayList<XeMay> getLoaiXE(String ten) {
        return this.repo.getXe(ten);
    }
    public void insert(XeMay cm) {
        this.repo.inssert(cm);
    }

    public void delete(String ma) {
        this.repo.delete(ma);
    }

    public void update(String ma, XeMay cm) {
        this.repo.update(ma, cm);
    }
}
