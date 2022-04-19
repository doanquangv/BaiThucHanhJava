package BuildClass;

public class Customer extends Person {
    private String Address;
    private String dob;

    public Customer(){

    }

    public Customer(String name, int age, String Address, String dob){
        this.Address = Address;
        this.dob = dob;
    }

    public void DiaChi() {
        System.out.println("nhap dia chi: ");
        Address = scanner.nextLine();
    }

    public void NgaySinh() {
        System.out.println("nhap ngay sinh: ");
        dob = scanner.nextLine();
    }
    
    public void HienThiThongTin() {
        System.out.println("Dia chi la: " + Address);
        System.out.println("ngay sinh la: " + dob);
        System.out.println("Ten la: " + name);
        System.out.println("Tuoi la: " + age);
    }
    
}
