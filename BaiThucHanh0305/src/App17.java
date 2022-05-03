import java.util.ArrayList;

public class App17 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);


        System.out.println("cac phan tu trong arrListInteger la : ");
        for (int number :  a) {
            System.out.print(number + " " );
        }

    }
}
