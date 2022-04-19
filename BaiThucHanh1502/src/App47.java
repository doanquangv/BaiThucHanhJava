import java.util.Scanner;
public class App47 {

    public static void main(String[] args) {
        float sum = 0, number;
        Scanner sc = new Scanner(System.in);        
        do {
            System.out.println("Nhap vao so bat ky:");
            number = sc.nextFloat();
            sum += number;
            if (sum > 100)
                break;
        } while (number > 0);         
        System.out.println("Tong = " + sum);
        sc.close();

    }
} 