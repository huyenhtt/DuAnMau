/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.implemes;

import java.util.List;
import Models.BanHangM;
import Models.ChiTietSP;

/**
 *
 * @author Admin
 */
public interface IChiTietSPS {

    List<ChiTietSP> getList();

    List<BanHangM> getSp();

    Integer insertCTsp(ChiTietSP ct);

    Integer updateCTsp(String id, ChiTietSP ct);

    Integer deleteCTsp(String id);
}
