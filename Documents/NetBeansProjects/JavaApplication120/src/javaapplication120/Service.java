/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication120;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Service {
    ArrayList<KhachHang> lisKH=new ArrayList<>();
    public ArrayList<KhachHang> load(){
    return lisKH;
    } 
    public void ghiFile() throws FileNotFoundException, IOException{
    File file=new File("t.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException iOException) {
        }
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        for (KhachHang khachHang : lisKH) {
            oos.writeObject(khachHang);
        }
        oos.close();
        fos.close();
    }
    public ArrayList<KhachHang> docFile() throws FileNotFoundException, IOException, ClassNotFoundException{
    File file=new File("t.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException iOException) {
        }
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        KhachHang kh=new KhachHang();
        ArrayList<KhachHang> lis=new ArrayList<>();
        while (fis.available()>0) {            
            kh=(KhachHang)ois.readObject();
            lis.add(kh);
        }
        fis.close();
        ois.close();
        return lis;
    }
    public ArrayList<KhachHang> open() throws IOException, FileNotFoundException, ClassNotFoundException{
    lisKH=docFile();
    return lisKH;
    }
    public Boolean them(KhachHang kh){
        if (kh==null) {
            return false;
        }else{
        lisKH.add(kh);
        return true;
        
        }
    
    }
    public ArrayList<KhachHang> xoa(int row){
    lisKH.remove(row);
    return lisKH;
    }

   
}
