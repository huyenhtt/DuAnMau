/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.implemes;

import java.util.List;
import Models.ChucVu;

/**
 *
 * @author Admin
 */
public interface IChucVuSer {

    List<ChucVu> getList();

    void insertCV(ChucVu cv);

    void updateCV(String ma, ChucVu cv);

    void deleteCV(String ma);

    String maCheckCV(String ma);

}
