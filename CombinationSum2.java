import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CombinationSum2 {

    public static void main(String[] args) {
        HashSet<List<Integer>> hs = new HashSet<>();

        int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
        Arrays.sort(arr);
        int target = 8;
        helper(0, arr, target, hs, new ArrayList<>());

        List<List<Integer>> l = new ArrayList<>(hs);

        System.out.println(l);

    }

    public static void helper(int idx, int[] nums, int target, HashSet<List<Integer>> hs, List<Integer> l) {
        if (idx == nums.length) {
            if (target == 0) {
                hs.add(new ArrayList<>(l));
            }
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) continue;
        }
        if (nums[idx] <= target) {
            l.add(nums[idx]);
            helper(idx + 1, nums, target - nums[idx], hs, l);
            l.remove(l.size() - 1);
        }
        helper(idx + 1, nums, target, hs, l);
    }

}
