/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BanHAng;

import Models.ChiTietHD;
import Models.ChiTietSP;
import java.util.List;
import ViewModels.HoaDonBH;

/**
 *
 * @author Admin
 */
public interface IBanHangR {

    List<ChiTietSP> getSPham();

    Integer updateSP(ChiTietSP bh, String id);

    Integer insertGHang(ChiTietHD ct);

    List<ChiTietHD> allGioHang();

    List<HoaDonBH> all();

    void updateBh(HoaDonBH bh);
}
