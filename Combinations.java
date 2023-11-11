import java.util.*;

public class Combinations {

    public static void main(String[] args) {
        int n = 4, k = 2;
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(1, n, new ArrayList<>(), ans ,k);
        System.out.println("All Possible K combinations : " + ans);
        return;
    }

    private static void findCombinations(int start, int n, List<Integer> current, List<List<Integer>> ans ,int k) {
        if (current.size() == k) {
            ans.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i <= n; i++) {
            current.add(i);
            findCombinations(i + 1, n, current, ans ,k);
            current.remove(current.size() - 1);
        }
    }

}
