/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BanHAng;

import Models.ChiTietHD;
import Models.ChiTietSP;
import java.util.List;
import Repositories.BanHangRepo;
import Repositories.impls.IBanHangR;
import Services.implss.IBanHangS;
import ViewModels.HoaDonBH;

/**
 *
 * @author Admin
 */
public class BanHangSer implements IBanHangS {

    private final IBanHangR repo;

    public BanHangSer() {
        this.repo = new BanHangRepo();
    }

    @Override
    public List<ChiTietSP> getsP() {
        try {
            return this.repo.getSPham();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Integer insertrHDCT(ChiTietHD ct) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ChiTietHD> getAllGioHang() {
        try {
            return this.repo.allGioHang();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<HoaDonBH> getList() {
        return this.repo.all();
    }

    @Override
    public void updateBh(HoaDonBH bh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
