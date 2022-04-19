import java.util.Scanner;
public class App55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cac so chia het cho 5 la: ");
             
        for (int a = 0; a <= 20; a++) {
            // nếu i không chia hết cho 5 thì quay lại vòng lặp for
            if (a % 5 != 0) {
                continue;
            }
        System.out.println(a);
        }
        scanner.close();
        
    }
}