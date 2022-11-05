/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVienHH;

import repositorys.NhanVienRepo;
import java.util.ArrayList;
import models.NhanVien;

/**
 *
 * @author Admin
 */
public class NhanVienSer {

    private NhanVienRepo repo;

    public NhanVienSer() {
        this.repo = new NhanVienRepo();
    }

    public ArrayList<NhanVien> getLisst() {
        return this.repo.all();
    }

    public ArrayList<NhanVien> getMAA() {
        return this.repo.getMAa();
    }

    public void updatenv(String ma, NhanVien nvv) {
        this.repo.updatekk(ma, nvv);
    }

    public void inssertnv(NhanVien nvv) {
        this.repo.inssertkh(nvv);
    }

    public String checkManv(String ma) {
        return this.repo.checkMa(ma);
    }

    public void deletenv(String ma) {
        this.repo.deletekk(ma);
    }
}
