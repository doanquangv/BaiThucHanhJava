import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class App113 {
  public static void main(String[] args) {
    HashSet<String> hashSet = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    String name;
    hashSet.add("Tao");
    hashSet.add("Thanh long");
    hashSet.add("Xoai");
    hashSet.add("Nhan");
    hashSet.add("Mit");
    hashSet.add("Buoi");

    System.out.println("Cac phan tu trong hashset la: ");
    System.out.println(hashSet);

    System.out.println("Nhap mot loai trai cay bat ky:");
    name = sc.next();
    if(hashSet.contains(name)) {
      System.out.println("Tim thay ten trai cay vua nhap");
    } else {
      System.out.println("khong tim thay ten trai cay vua nhap");
    }
    hashSet.remove("Tao");
    System.out.println("cac phan tu con lai trong hashSet la: ");
    System.out.println(hashSet);

    List<String> listFruits = new ArrayList<>();
    listFruits.add("Apple");
    listFruits.add("Banana");
    listFruits.add("Mango");
    listFruits.add("Apple");

    hashSet.addAll(listFruits);
    System.out.println("cac phan tu trong hashsetfruits sau khi them ma: ");
    Iterator<String> iterator = hashSet.iterator();
    while (iterator.hasNext()) {
        System.out.print(iterator.next() + "\t");
    }

    hashSet.removeAll(listFruits);
    System.out.println("\ncac phan tu trong hashsetfruit sau khi xoa la: " + hashSet);
    sc.close();
  }
}
