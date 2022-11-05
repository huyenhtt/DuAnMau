/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyBan;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class SachService {

    private SachRepo repo;
    
    public SachService() {
        this.repo = new SachRepo();
    }

    public ArrayList<Sach> getList() {
        return this.repo.all();
    }

    public void inssert(Sach sach) {
        this.repo.insert(sach);
    }

    public void delete(int id) {
        this.repo.delete(id);
    }

    public void update(int id, Sach s) {
        this.repo.update(id, s);
    }
}
