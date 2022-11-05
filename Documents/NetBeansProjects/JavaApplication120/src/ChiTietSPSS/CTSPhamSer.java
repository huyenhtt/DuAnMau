/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChiTietSPSS;

import repositorys.CTSanPhamRepo;
import java.util.ArrayList;
import java.util.List;
import models.BanHangM;
import models.ChiTietSP;

/**
 *
 * @author Admin
 */
public class CTSPhamSer {

    private CTSanPhamRepo repo;

    public CTSPhamSer() {
        this.repo = new CTSanPhamRepo();
    }

    public ArrayList<ChiTietSP> getList() {
        return this.repo.all();
    }
    public List<BanHangM> getSPM(){
    return this.repo.getSPham();
    }
    public void insertSPCT(ChiTietSP ct) {
        this.repo.inssertkh(ct);
    }

    public void deleteCtSP(String id) {
        this.repo.deletekk(id);
    }

    public void updateCTSP(String id, ChiTietSP ct) {
        this.repo.updatekk(id, ct);
    }
}
