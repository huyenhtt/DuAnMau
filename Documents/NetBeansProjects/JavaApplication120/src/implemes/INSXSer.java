/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.implemes;

import java.util.List;
import Models.NSX;

/**
 *
 * @author Admin
 */
public interface INSXSer {

    List<NSX> getList();

    void insertNSXS(NSX ns);

    void deleteNSXS(String ma);

    void updateNSXS(String ma, NSX ns);

    String checkMANSXS(String ma);

}
