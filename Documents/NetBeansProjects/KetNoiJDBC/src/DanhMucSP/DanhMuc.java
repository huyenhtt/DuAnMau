/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhMucSP;

/**
 *
 * @author Admin
 */
public class DanhMuc {
    private int id;
    private String tendm;
    private String mota;
    private int tranhgThai;

    public DanhMuc() {
    }

    public DanhMuc(int id, String tendm, String mota, int tranhgThai) {
        this.id = id;
        this.tendm = tendm;
        this.mota = mota;
        this.tranhgThai = tranhgThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTendm() {
        return tendm;
    }

    public void setTendm(String tendm) {
        this.tendm = tendm;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getTranhgThai() {
        return tranhgThai;
    }

    public void setTranhgThai(int tranhgThai) {
        this.tranhgThai = tranhgThai;
    }
    
}
