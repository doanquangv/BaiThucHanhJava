import java.util.ArrayList;
import java.util.Scanner;

public class App22 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        int number;
        Scanner scanner= new Scanner(System.in);

        System.out.println("nhap so phan ti cua arraylist: ");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++  ) {
            System.out.println("nhap phan tu thu " + i +": ");
            number = scanner.nextInt();
            a.add(number);
            scanner.close();
        }

        int max = a.get(0);

        for(int i = 1; i <a.size(); i++ ) {

            if(a.get(i).compareTo(max) >0) {
                max = a.get(i);
            }
        }
        System.out.println("phan tu lon nhat la = " + max);

    }
}
