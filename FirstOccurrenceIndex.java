public class FirstOccurrenceIndex {

    public static void main(String[] args) {
        int[] arr = { 2, 8, 7, 6, 8 };
        int idx = 0;
        int key = 8;

        int result = findFIRST(arr, key, idx);
        System.out.println(result);
    }

    private static int findFIRST(int[] arr, int key, int idx) {
        if (idx == arr.length) {
            return -1;
        }
        if (key == arr[idx]) {
            return idx;
        } else {
            int x = findFIRST(arr, key, idx + 1);
            return x;
        }
    }
}
