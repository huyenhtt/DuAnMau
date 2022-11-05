/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.implemes;

import java.util.List;
import Models.GioHang;

/**
 *
 * @author Admin
 */
public interface IGioHangSer {

    List<GioHang> getLisst();

    void insertGI(GioHang gh);

    void updateGI(GioHang gh, String ma);

    void deleteGI(String ma);

    String maCheckGI(String ma);

}
