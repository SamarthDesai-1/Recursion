public class Sort {

    public static void main(String[] args) {
        int[] array = { 5, 4, 3, 2, 1 };

        sortARRAY(array, 0, 1);

        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    private static void sortARRAY(int[] array, int i, int j) {
        if (i == array.length - 1) {
            return;
        }

        if (array[j] > array[i]) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        sortARRAY(array, i + 1, j + 1);
    }
}
