public class PrintDecreasing {

    public static void main(String[] args) {
        int n = 5;
        int range = 1;

        printDEC(n, range);
    }

    private static void printDEC(int n, int range) {
        if (n == range) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDEC(n - 1, range);
    }
}