import java.util.LinkedHashSet;
import java.util.Set;;

public class App60 {
    public static void main(String[] args) {
        Set<String> linkedhashset = new LinkedHashSet<String>();

        linkedhashset.add("Java");
        linkedhashset.add("C++");
        linkedhashset.add("Java");
        linkedhashset.add ("PHP");

        for (String str : linkedhashset) {
            System.out.println(str);
        }
    }
}