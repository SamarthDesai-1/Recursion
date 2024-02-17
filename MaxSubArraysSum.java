public class MaxSubArraysSum {
    
    public static int maxInSubArray(int[] arr ,int index) {
        int max = Integer.MIN_VALUE;
        if (index == arr.length) return max;

        int sum = 0;
        for (int i = 0; i <= index; i++) {
            sum = sum + arr[i];
        }
        max = maxInSubArray(arr, index + 1);
        max = Math.max(max, sum);

        return max;
    }


    public static void main(String[] args) {
        int[] arr = { 1, 200, 3, 4, 5, 6 };
        System.out.println(maxInSubArray(arr, 0));
    }
}
