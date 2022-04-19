package main;

import Silde71.HinhTron;
public class App71 {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();

        ht.setBanKinh(10);
        
        float chuVi = ht.tinhChuVi();
        float dienTich = ht.tinhDienTich();
        System.out.println("Chu vi hinh tron: " + chuVi + "; Va dien tich: " + dienTich );
    }
    
}
