public class ReverseArray {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int start = 0;
        int end = array.length - 1;

        reverse(array, start, end);

        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    private static void reverse(int[] array, int start, int end) {
        if (start > end) {
            return;
        }

        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;

        reverse(array, start + 1, end - 1);

    }
}
