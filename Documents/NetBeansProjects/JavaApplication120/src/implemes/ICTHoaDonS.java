/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.implemes;

import java.util.List;
import Models.ChiTietHD;

/**
 *
 * @author Admin
 */
public interface ICTHoaDonS {

    List<ChiTietHD> getList();

    void insertCt(ChiTietHD ct);

    void updateCt(String id, ChiTietHD ct);

    void deleteCt(String id);
}
