import java.util.ArrayList;
import java.util.Scanner;

public class App110 {
  public static void main(String[] args) {
    ArrayList<Integer> arrInteger = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int number;
    System.out.println("Nhap so phan tu cua mang: ");
    int n = sc.nextInt();
    for(int i = 0; i < n; i++) {
      System.out.println("Nhap phan tu thu " + i + ": ");
      number= sc.nextInt();
      arrInteger.add(number);
    }
    int max = arrInteger.get(0);
    
    for (int i = 1; i < arrInteger.size(); i++) {
      if(arrInteger.get(i).compareTo(max) > 0) {
        max = arrInteger.get(i);
      }
    }
    System.out.println("Phan tu max cua mang la: " +max);
    sc.close();  
}
}