import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
        Float a, b, c, d, e, f, x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a: ");
        a = sc.nextFloat();
        System.out.print("nhap b: ");
        b = sc.nextFloat();
        System.out.print("nhap c: ");
        c = sc.nextFloat();
        System.out.print("nhap d: ");
        d = sc.nextFloat();
        System.out.print("nhap e: ");
        e = sc.nextFloat();
        System.out.print("nhap f: ");
        f = sc.nextFloat();
        if (a*d - b*c ==0) {
            System.out.println("vo nghiem");
        }
        else {
            x = (e*d - b*f)/(a*d - b*c);
            y = (a*f - e*c)/(a*d - b*c);
            System.out.println("x = " + x + "y = " + y);
        }
sc.close();
    }
}