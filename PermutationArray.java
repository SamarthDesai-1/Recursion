import java.util.ArrayList;
import java.util.List;

public class PermutationArray {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, ans);
        System.out.println(ans);
    }

    private static void helper(int[] nums, int idx, List<List<Integer>> ans) {
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
            System.out.println("Before Recursion Call " + j + " " + idx);
            swap(j, idx, nums);
            helper(nums, idx + 1, ans);
            swap(idx, j, nums);
            System.out.println("After Recursion Call " + j + " " + idx);
        }
    }

    private static void swap(int start, int end, int[] nums) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

}
