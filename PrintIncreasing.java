public class PrintIncreasing {

    public static void main(String args[]) {
        int n = 1;
        int range = 5;

        printINC(n, range);
    }

    private static void printINC(int n, int range) {
        if (n == range) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printINC(n + 1, range);
    }
}
