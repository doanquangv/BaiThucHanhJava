package main;

import BuildClass.Person;
import BuildClass.Student;
import BuildClass.Employee;
import BuildClass.Customer;
import BuildClass.VIPCustomer;
import BuildClass.employee.FulltimeEmpoyee;
import BuildClass.employee.PartTimeEmpoyee;
import BuildClass.student.OfflineStudent;
import BuildClass.student.OnlineStudent;

public class mainPerson {
    public static void main (String[] args) {
        Person ps = new Person();
        Student st = new Student();
        OfflineStudent off = new OfflineStudent();
        OnlineStudent onl = new OnlineStudent();
        Employee em = new Employee();
        PartTimeEmpoyee pt = new PartTimeEmpoyee();
        FulltimeEmpoyee ft =new FulltimeEmpoyee();
        Customer cs = new Customer();
        VIPCustomer vip = new VIPCustomer();

        ps.NhapTen();
        ps.NhapTuoi();

        st.diemly();
        st.diemtoan();
        st.diemTrungBinh();

        off.hocOff();

        onl.hoconl();

        em.NhapTen();
        em.NhapTuoi();
        em.totalsalary();

        pt.NhanVienpt();
        
        ft.NhanVienft();

        cs.NhapTen();
        cs.NhapTuoi();
        cs.DiaChi();
        cs.NgaySinh();

        vip.NhapTen();
        vip.NhapTuoi();
        vip.nhapDiaChi();
        vip.nhapNgaySinh();
        vip.nhapMaDiscount();



    }
}
