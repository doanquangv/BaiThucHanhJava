import java.util.LinkedList;
public class AppLink{
    public static void main(String[] args){
       LinkedList<NhanVien> nv = new LinkedList<>();
       NhanVien nv1 = new NhanVien("1a", "Nguyen Van A", "Hanoi");
       NhanVien nv2 = new NhanVien("2b", "Nguyen Van B", "HCM"); 
       NhanVien nv3 = new NhanVien("3c", "Nguyen Van C", "Danang");
       NhanVien nv4 = new NhanVien("4d", "Nguyen Van D", "Ninhbinh");
       nv.add(nv1);
       nv.add(nv2);
       nv.add(nv3);
       nv.remove(nv3);
       nv.set(3, nv4);
       showList(nv);

}

    private static void showList(LinkedList<NhanVien> nv) {
    }
}