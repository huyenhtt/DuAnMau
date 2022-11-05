/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.implemes;

import java.util.List;
import Models.HoaDon;

/**
 *
 * @author Admin
 */
public interface IHoaDonS {

    List<HoaDon> getList();

    Integer insertHD(HoaDon hd);

    Integer updateHD(String ma, HoaDon hd);

    Integer deleteHD(String ma);

    String checkMaHD(String ma);
}
