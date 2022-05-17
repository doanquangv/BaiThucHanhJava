import java.util.Scanner;
import java.util.TreeSet;

public class App69 {
    public static void main (String[] args) {
        int number; 
        TreeSet<Integer> treeint = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        treeint.add(0);
        treeint.add(3);
        treeint.add(1);
        treeint.add(4);
        treeint.add(2);
        treeint.add(8);
        treeint.remove(2);
        

        System.out.println("cac phan tu trong treeint: ");
        System.out.println(treeint);
        System.out.println("nhap phan tu can them: ");
        number = scanner.nextInt();
        

        if (!treeint.contains(number)) {

            treeint.add(number);
            System.out.println("them thanh cong!");
            System.out.println("cac thanh phan trong treeint sau khi them la: ");
            System.out.println(treeint);
        }else {
            System.out.println("phna tu " + number +"da ton tai!");
        }
    }
}
