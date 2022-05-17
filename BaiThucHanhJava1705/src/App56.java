import java.util.HashSet;
import java.util.Scanner;

public class App56 {
    public static void main(String[] args) throws Exception{
        String name;
        HashSet<String>  hashsetstring = new HashSet<>();
        Scanner scanner = new Scanner(System.in);


        hashsetstring.add("Wilson");
        hashsetstring.add("Nike");
        hashsetstring.add("Volvo");
        hashsetstring.add("Kia");
        hashsetstring.add("Lenovo");
        hashsetstring.add("Lenovo");


        System.out.println(" Cac phan tu trong HashsetString: ");
        System.out.println(hashsetstring);
        System.out.println("nhap phan tu can xoa: ");
        name = scanner.next();


        if (!hashsetstring.contains(name)) {
            hashsetstring.remove(name);
            System.out.println("xoa phan tu thanh cong!");
            System.out. println(" Cac phan tu trong hashset sau khi xoa: ");
            System.out.println(hashsetstring);
        }else {
            System.out.println("xoa khong thanh cong");
        }
    }
}
