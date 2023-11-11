import java.util.*;

public class CombinationsRecursion {

    public static void main(String[] args) {
        int n = 4, k = 2;
        int[] nums = new int[n];

        int x = 1;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = x++;
        }

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        getComb(nums, 0, 0, ans, li);

        System.out.println(ans);
    }

    private static void getComb(int[] nums, int choice, int idx, List<List<Integer>> ans, List<Integer> li) {
        if (idx == nums.length - 1) {
            ans.add(li);
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            li.add(nums[idx]);
            getComb(nums, choice, idx + 1, ans, li);
        }
    }

}
