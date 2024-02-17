import java.util.*;

public class Permutations2HashSet {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2 };
        HashSet<List<Integer>> hs = new HashSet<>();

        helper(arr, 0, hs);

        List<List<Integer>> ans = new ArrayList<>(hs);
        System.out.println(ans);
    }

    private static void helper(int[] nums, int idx, HashSet<List<Integer>> ans) {
        int n = nums.length;
        if (idx == n - 1) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                l.add(nums[j]);
            }
            ans.add(l);
            return;
        }
        for (int j = idx; j < n; j++) {
            if (j > idx && nums[j] == nums[j - 1])
                continue;
            swap(j, idx, nums);
            helper(nums, idx + 1, ans);
            swap(idx, j, nums);
        }
    }

    private static void swap(int start, int end, int[] nums) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

}
