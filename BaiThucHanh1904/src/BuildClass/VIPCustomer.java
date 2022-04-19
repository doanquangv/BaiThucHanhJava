package BuildClass;

import java.util.Scanner;

public class VIPCustomer extends Person {
    private String Discount;
    private String Address;
    private String dob;

    public VIPCustomer() {}

    public VIPCustomer(String name, int age, String Address, String dob, String Discount ) {
        this.Discount = Discount; 
    }

    public void nhapDiaChi(){
        System.out.println("Dia chi la: " + Address);
        Scanner sc = new Scanner(System.in);
        Address = sc.nextLine();
    }
    public void nhapNgaySinh(){
        System.out.println("Ngay sinh la: " + dob);
        Scanner sc = new Scanner(System.in);
        dob = sc.nextLine();
    }
    public void nhapMaDiscount(){
        System.out.println("Ma giam gia la: " + Discount);
        Scanner sc = new Scanner(System.in);
        Discount = sc.nextLine();
    }
    
    
   
}
