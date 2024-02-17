public class SumOfAllSubsets {

    static void subsetsSum(int[] nums, int sum, int idx) {

        if (idx == nums.length) {
            System.out.println(sum);
            return;
        }
        int curr = nums[idx];

        subsetsSum(nums, sum + curr, idx + 1);

        subsetsSum(nums, sum, idx + 1);

    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5 };
        int sum = 0;
        subsetsSum(arr, sum, 0);
    }
}
