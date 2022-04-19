package BuildClass;

import java.util.Scanner;
public class Person {
    public String name;
    public String age;
    Scanner scanner = new Scanner(System.in);

    public Person() {
        
    }
    public Person(String name, String age) {
        this.name = name;
        this.age = age;
        
    }
    public void NhapTen() {
        System.out.println("Nhap ten: ");
        name = scanner.nextLine();
    }

    public void NhapTuoi() {
        System.out.println("Nhap Tuoi: ");
        age = scanner.nextLine();
    }

    public void HienThiThongTin() {
        System.out.println("ten: " + name);
        System.out.println("tuoi: " + age);
    }
    
}
