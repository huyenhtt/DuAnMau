/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SachLuyenTap;

import java.util.ArrayList;


/**
 *
 * @author Admin
 */
public class SachService {
   private SachRepo repo;

    public SachService() {
        this.repo=new SachRepo();
    }
   public ArrayList<Sach> getList(){
   return this.repo.all();
   
   }
   public void insert(Sach s){
   this.repo.inserrt(s);
   }
   public Sach searchS(String ma){
   return this.repo.search(ma);
   }
}
