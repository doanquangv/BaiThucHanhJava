import java.util.Scanner;
public class PhuongTrinhBacHai{
    float a, b, c, x1, x2, delta;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PhuongTrinhBacHai pt = new PhuongTrinhBacHai();
       pt.nhapsolieu();
       pt.tinhdelta();
       pt.indelta();
       pt.giaiptb2();
    }
    public void nhapsolieu(){
        System.out.println("nhap a: ");
        a = scanner.nextFloat();
        System.out.println("nhap b: ");
        b = scanner.nextFloat();
        System.out.println("nhap c: ");
        c = scanner.nextFloat();
    }
    public void tinhdelta(){
        delta = b * b - 4 * a * c ;
    }
    public void indelta() {
        System.out.println("delta =" + delta);
    }
    public void giaiptb2(){
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            x1 = x2 = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiem kep x1 = x2= " + x1);
        } else {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("PT co 2 nghiem x1 = " + x1 + "x2 = " + x2);
        }
    }
}
