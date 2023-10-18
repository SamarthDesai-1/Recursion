public class MaxInArray {

    public static void main(String[] args) {
        int[] arr = { 10, 9000, 100, 200 };
        int idx = 0;

        int result = findMAX(arr, idx);

        System.out.println("Max in Array : " + result);

    }

    private static int findMAX(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }

        int x = findMAX(arr, idx + 1);
        int max = Math.max(arr[idx], x);
        return max;
    }
}
