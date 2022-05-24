import java.util.ArrayList;
import java.util.Comparator;
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
    System.out.println("Nhap phan tu can xoa: ");
    number = sc.nextInt();
    for(int i = 0; i < arrInteger.size(); i++) {
      if(arrInteger.get(i) == number) {
        arrInteger.remove(number);
      }
    }
    System.out.println("arrayList sau khi xoa:");
    System.out.println(arrInteger);

    arrInteger.sort(Comparator.naturalOrder());
    System.out.println("arrayList sau khi sap xep:");
    System.out.println(arrInteger);
    sc.close();
    } 
}
