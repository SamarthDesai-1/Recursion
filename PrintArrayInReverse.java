public class PrintArrayInReverse {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };

        int idx = 0;

        printREVERSE(array, idx);
    }

    private static void printREVERSE(int[] array, int idx) {
        if (idx == array.length)
            return;

        printREVERSE(array, idx + 1);
        System.out.print(array[idx] + " ");
    }

}
