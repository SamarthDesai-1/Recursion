public class ReverseArray {

    public static void reverse(int[] arr, int start, int end) {
        if (start >= end) return;

        int x = arr[start];
        arr[start] = arr[end];
        arr[end] = x;

        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};
        int n = arr.length - 1;
        reverse(arr, 0, n);

        for (int element : arr) {
            System.out.print(element + " ");
        }

    }
}
