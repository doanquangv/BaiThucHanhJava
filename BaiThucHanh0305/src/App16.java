import java.util.ArrayList;

public class App16 {
    public static void main(String[] args)  {

        ArrayList<String> a = new ArrayList<>();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("5");
        a.set(4, "7");
        
        System.out.println("cac phan tu arraylist la: ");
        for ( int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i) + "");

        }
    }
}
