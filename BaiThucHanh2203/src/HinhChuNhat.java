import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args)  {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();
    }

    float cr;
    float cd;
    float cv;
    float dt;

    Scanner scanner= new Scanner(System.in);


    void nhapChieuDai(){
        System.out.println("Hay nhap vao chieu dai hinh chu nhat");
        cd = scanner.nextFloat();
    }
    void nhapChieuRong(){
        System.out.println("Hay nhap vao chieu rong hinh chu nhat");
        cr = scanner.nextFloat();
    }
    void tinhChuVi() {
        cv = (cd + cr) *2;
    }

    void tinhDienTich() {
        dt = cd * cr;
    }

    void inChuVi() {
        System.out.println("Chu vi Hinh Chu Nhat: " + cv);
    }

    void inDienTich() {
        System.out.println("Dien tich Hinh Chu Nhat : " + dt);
    }
}