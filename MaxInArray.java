public class MaxInArray {

    public static int maximum(int[] nums, int index) {
        int max = Integer.MIN_VALUE;
        if (index == nums.length)
            return max;
        max = maximum(nums, index + 1);
        max = Math.max(max, nums[index]);
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 47, 2000, 68, 8 };
        System.out.println(maximum(arr, 0));
    }
}


