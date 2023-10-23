package SUBSETS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2 };
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), result);

        System.out.println(result);

    }

    private static void generateSubsets(int index, int[] nums, ArrayList<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i - 1] == nums[i]) continue;
            current.add(nums[i]);
            generateSubsets(i + 1, nums, current, result);
            current.remove(current.size() - 1);
        }
    }

}
