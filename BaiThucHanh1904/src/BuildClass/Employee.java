package BuildClass;

public class Employee extends Person {
    private double salary;
    private double rate;
    

    public Employee() {}

    public Employee(String name, String age, double salary, double rate) {
        super(name, age);
        this.salary = salary;
        this.rate = rate;
    }
    public double totalsalary() {
        return salary * rate;
    }
    public void HienThiThongTin() {
        System.out.println("luong nhan duoc la: " + totalsalary() );
    }
}
