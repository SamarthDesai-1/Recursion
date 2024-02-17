public class SubArrays {

    public static void subArrays(int[] arr, int index) {
        if (index == arr.length)
            return;

        for (int i = 0; i <= index; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        subArrays(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        subArrays(arr, 0);

    }
}
