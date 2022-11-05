/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.implemes;

import Services.Impl.*;
import java.util.List;
import Models.CuaHang;

/**
 *
 * @author Admin
 */
public interface ICuaHangSer {

    List<CuaHang> getList();

    void insertCHI(CuaHang ch);

    void deleteCHI(String ma);

    void updateCHI(String ma, CuaHang ch);

    String maCheckCHI(String ma);
}
