package BuildClass;

import java.util.Scanner;

public class Student extends Person {
    
    private double math, physics, average;
    
    public Student() {

    }
    public Student( String name, int age, double math, double physics ){
        this.math = math;
        this.physics = physics;
        average = (math + physics) / 2;   
    } 

    public double getAverage() {
        return average;
    }

    public double getMatch() {
        return math;
    }

    public void diemtoan(){
        System.out.print("Nhap diem toan: ");
        Scanner sc = new Scanner(System.in);
        math = sc.nextDouble();
    }
    public void diemly(){
        System.out.print("Nhap diem vat ly: ");
        Scanner sc = new Scanner(System.in);
        physics = sc.nextDouble();
    }
    public void diemTrungBinh() {
        average = (math + physics) / 2; 
    }

    public void HienThiThongTin() {
        super.HienThiThongTin();
        System.out.println(" diem toan: " + math);
        System.out.println(" diem vat ly: " + physics);
        System.out.println(" Diem trung binh: " + average);

    }
    
}




