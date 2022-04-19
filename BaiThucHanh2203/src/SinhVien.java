import java.util.Scanner;

public class SinhVien{
    String MaSinhVien;
    String HoTen;
    Boolean GioiTinh;
    String DiaChi;
    String NgaySinh;
    Scanner scanner= new Scanner(System.in);
    
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.nhapMaSinhVien();
        sv.nhapHoTen();
        sv.nhapGioiTinh();
        sv.nhapDiaChi();
        sv.nhapNgaySinh();
        sv.inMaSinhVien();
        sv.inHoTen();
        sv.ingioiTinh();
        sv.inDiaChi();
        sv.inNgaySinh();
    }

    void nhapMaSinhVien(){
        System.out.println("Hay nhap Ma Sinh Vien ");
        MaSinhVien = scanner.next();
    }
    void nhapHoTen(){
        System.out.println("Hay nhap Ho Ten Sinh Vien ");
        HoTen = scanner.next();
    }
    void nhapGioiTinh() {
        System.out.println("Gioi Tinh la Nam ? (Y(yes) | N(no))");
        String result = scanner.next();
        if (result.equals("Y") || result.equals("y")) GioiTinh = true ;
        else GioiTinh = false;
    }
    void nhapDiaChi(){
        System.out.println("Hay nhap Dia Chi Sinh Vien ");
        DiaChi = scanner.next();
    }
    void nhapNgaySinh(){
        System.out.println("Hay nhap Ngay Sinh Sinh Vien ");
        NgaySinh = scanner.next();
    }

    void inMaSinhVien() {
        System.out.println("Ma sinh vien cua ban la: " + MaSinhVien);
    }

    void inHoTen() {
        System.out.println("Ho ten cua ban la: " + HoTen);
    }
    

    void ingioiTinh() {
        System.out.println("gioitinh la nam? (Y(yes) | N(no))");
        String result = scanner.next();
        if (result.equals("Y") || result.equals("y")) GioiTinh = true ;
        else GioiTinh = false;
    }
    void inDiaChi() {
        System.out.println("Dia chi cua ban la: " + DiaChi);
    }

    void inNgaySinh() {
        System.out.println("Ngay sinh cua ban la: " + NgaySinh);
    }

        
    }


