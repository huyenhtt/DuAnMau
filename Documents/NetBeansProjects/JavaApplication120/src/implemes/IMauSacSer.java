/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.implemes;

import java.util.List;
import Models.MauSac;

/**
 *
 * @author Admin
 */
public interface IMauSacSer {

    List<MauSac> getList();

    void insertMaus(MauSac mauS);

    void deleteMauS(String ma);

    void updateMaus(String ma, MauSac mauS);

    String checkMAMaus(String ma);
}
