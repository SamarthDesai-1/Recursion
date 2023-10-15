public class Sum {

    public static void main(String[] args) {
        int[] array = { 87, 5, 8, 2, 5, 6, 2, 2 };

        int sum = findSUM(array, 0);
        System.out.println(sum);

    }

    private static int findSUM(int[] array, int start) {
        if (start == array.length) {
            return 0;
        }
        int sum = 0;
        sum += array[start];
        return sum += findSUM(array, start + 1);
    }
}
