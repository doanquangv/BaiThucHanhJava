public class App2203 {
    public static void main(String[] args) throws Exception {
        System.out.println(" bai1: HinhChuNhat ");
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();

        System.out.println(" bai2: Person ");
    
        Person ps = new Person();
        ps.nhapPersonID();
        ps.nhapPersonName();
        ps.nhapGender();
        ps.nhapAddress();
        ps.inThongTin();

        System.out.println(" bai3: SinhVien ");

        SinhVien sv = new SinhVien();
        sv.nhapMaSinhVien();
        sv.nhapHoTen();
        sv.nhapDiaChi();
        sv.nhapGioiTinh();
        sv.nhapNgaySinh();
        sv.inMaSinhVien();
        sv.inHoTen();
        sv.inDiaChi();
        sv.ingioiTinh();
        sv.inNgaySinh();

        System.out.println(" bai4: PhuongTrinhBacHai ");

        PhuongTrinhBacHai pt = new PhuongTrinhBacHai();
       pt.nhapsolieu();
       pt.tinhdelta();
       pt.indelta();
       pt.giaiptb2();

    }
}
