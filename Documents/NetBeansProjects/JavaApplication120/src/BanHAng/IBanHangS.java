/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BanHAng;

import Models.ChiTietHD;
import Models.ChiTietSP;
import Services.*;
import java.util.List;

import ViewModels.HoaDonBH;

/**
 *
 * @author Admin
 */
public interface IBanHangS {

    List<ChiTietSP> getsP();

  

    Integer insertrHDCT(ChiTietHD ct);

    List<ChiTietHD> getAllGioHang();

    List<HoaDonBH> getList();

    void updateBh(HoaDonBH bh);
}
