import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetToArrayList {

    public static void main(String[] args) {
        HashSet<List<Integer>> hs = new HashSet<>();

        List<Integer> l = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            l.add(i);
        }
        l.add(1);
        l.add(2);
        System.out.println("ArrayList : " + l);

        hs.add(l);
        System.out.println("HashSet : " + hs);

        List<List<Integer>> newList = new ArrayList<>(hs);

        System.out.println(newList);
    }

}
