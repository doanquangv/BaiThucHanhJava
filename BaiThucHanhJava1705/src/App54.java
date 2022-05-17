import java.util.HashSet;
import java.util.Scanner;

public class App54 {
    
    public static void main(String[] args) throws Exception {
         int number;
         HashSet<Integer> hashSetint = new HashSet<>();

         Scanner scanner = new Scanner(System.in);

        
        hashSetint.add(0);
        hashSetint.add(3);
        hashSetint.add(1);
        hashSetint.add(4);
        hashSetint.add(2);
        hashSetint.add(8);
        hashSetint.remove(1);

        System.out.println(" Cac phan tu trong Hashset: ");
        System.out.println(hashSetint);
        System.out.println("nhap phan tu can them: ");
        number = scanner.nextInt();


        if (!hashSetint.contains(number)) {
            hashSetint.add(number);
            System.out.println("Them phan tu thanh cong:");
            System.out. println(" Cac phan tu trong hashset sau khi them: ");
            System.out.println(hashSetint);
        }else {
            System.out.println("phan tu " + number + " da ton tai!");
        }
         

    }
}
