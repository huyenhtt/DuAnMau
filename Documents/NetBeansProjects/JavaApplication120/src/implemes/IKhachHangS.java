/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.implemes;

import java.util.List;
import Models.KhachHang;

/**
 *
 * @author Admin
 */
public interface IKhachHangS {

    List<KhachHang> getList();

    void insertkh(KhachHang kh);

    void updatekh(String ma, KhachHang kh);

    void deletekh(String ma);
    
    List<KhachHang> getMakh();

    String checkMakh(String ma);
}
