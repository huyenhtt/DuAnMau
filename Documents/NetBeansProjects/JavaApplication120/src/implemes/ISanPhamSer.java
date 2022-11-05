/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.implemes;

import java.util.List;
import Models.SanPham;

/**
 *
 * @author Admin
 */
public interface ISanPhamSer {

    List<SanPham> getList();

    void insertSPI(SanPham sp);

    void updateSPI(String ma, SanPham sp);

    void deleteSPI(String ma);

    String maCheckSPI(String ma);
}
