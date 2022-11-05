/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.implemes;

import java.util.List;
import Models.NhanVien;

/**
 *
 * @author Admin
 */
public interface INhanVienS {

    List<NhanVien> getList();

    List<NhanVien> getmaNVV();

    Integer insertNVV(NhanVien nv);

    Integer updateNVV(String ma, NhanVien nv);

    Integer deleteNVV(String ma);

    String checkMaNVV(String ma);
}
