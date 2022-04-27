package Shape;

import java.util.Scanner;
public class Triangle extends Point {

  double AB;
  double BC;
  double AC;
  private Point pA = new Point();
  private Point pB = new Point();
  private Point pC = new Point();

  public void nhapToaDo() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap diem thu nhat: ");
    String tenDiem = scanner.next();
    System.out.println("Nhap toa do xA: ");
    float x = scanner.nextFloat();
    System.out.println("Nhap toa do yA: ");
    float y = scanner.nextFloat();
    pA = new Point(tenDiem, x, y);

    System.out.println("Nhap diem thu hai: ");
    tenDiem = scanner.next();
    System.out.println("Nhap toa do xB: ");
    x = scanner.nextFloat();
    System.out.println("Nhap toa do yB: ");
    y = scanner.nextFloat();
    pB = new Point(tenDiem, x, y);

    System.out.println("Nhap diem thu ba: ");
    tenDiem = scanner.next();
    System.out.println("Nhap toa do xC: ");
    x = scanner.nextFloat();
    System.out.println("Nhap toa do yC: ");
    y = scanner.nextFloat();
    pC = new Point(tenDiem, x, y);
    
    
    AB = Math.sqrt(Math.pow((pB.getX() - pA.getX()), 2) + Math.pow((pB.getY() -pA.getY() ), 2));
    BC = Math.sqrt(Math.pow((pC.getX() - pB.getX()), 2) + Math.pow((pC.getY() - pB.getY()), 2));
    AC = Math.sqrt(Math.pow((pC.getX() - pA.getX()), 2) + Math.pow((pC.getY() - pA.getY()), 2));
    
  }

  public void inToaDo() {
    System.out.println(" toa do thu nhat la: " + pA.tenDiem + "(" + pA.getX() + "," + pA.getY() + ")");
    System.out.println(" toa do thu hai la: " + pB.tenDiem + "(" + pB.getX() + "," + pB.getY() + ")");
    System.out.println(" toa do thu ba la: " + pC.tenDiem + "(" + pC.getX() + "," + pC.getY() + ")");
  }

  public void xacDinh() {
    System.out.println("Do dai AB la : " + AB);
    System.out.println("Do dai BC la: " + BC);
    System.out.println("Do dai Ac la : " + AC);
    

    if ((AB + BC > AC) && (AB + AC > BC) && (BC + AC > AB) &&
        (AB > 0) && (BC > 0) && (AC > 0)) {
      if ((AB == BC) && (BC == AC)) {
        System.out.println("Tam giac deu!");
      } else if ((AB == BC) || (AB == AC) || (BC == AC)) {
        System.out.println("Tam giac can!");
      } else if ((AB * AB == BC * BC + AC * AC) ||
          (BC * BC == AB * AB + AC * AC) ||
          (AC * AC == AB * AB + BC * BC)) {
        System.out.println("Tam giac vuong!");
      } else if (((AB * AB + BC * BC == AC * AC) && (AB == BC)) ||
          ((AB * AB + AC * AC == BC * BC) && (AB == AC)) ||
          ((BC * BC + AC * AC == AB * AB) && (BC == AC))) {
        System.out.println("Tam giac vuong can!");
      } else {
        System.out.println("Tam giac thuong!");
      }
    } else {
      System.out.println("3 canh cua tam giac khong thoa man dieu kien lap thanh tam giac!");
    }
  }
}

  
