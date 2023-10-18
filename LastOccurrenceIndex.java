public class LastOccurrenceIndex {

    public static void main(String[] args) {
        int[] arr = { 2, 8, 7, 6, 8 };
        int idx = arr.length - 1;
        int key = 8;

        int result = findLAST(arr, key, idx);
        System.out.println("Last Occurence of Index : " + result);
    }

    private static int findLAST(int[] arr, int key, int idx) {
        if (idx == 0) {
            if (arr[idx] == key) {
                return idx;
            }
            return -1;
        }

        int x = findLAST(arr, key, idx - 1);
        if (arr[idx] == key) {
            return idx;
        } else {
            return x;
        }
    }
}
