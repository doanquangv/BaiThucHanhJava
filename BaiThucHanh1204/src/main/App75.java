package main;

import Slide75.HinhHoc;
import Slide75.HinhTron;
import Slide75.HinhChuNhat;

public class App75 {
    public static void main (String[] args) {

        HinhHoc hh = new HinhHoc();
        HinhTron ht1 = new HinhTron();
        HinhTron ht2 = new HinhTron();
        HinhChuNhat hcn = new HinhChuNhat();

        System.out.println("Có tất cả " + HinhHoc.dem + " hinh trong ung dung");
    }
}
