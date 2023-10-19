public class PrintStairsPath {

    public static void main(String[] args) {
        int n = 2;

        String paths = "";

        printPATHS(n, paths);
    }

    private static void printPATHS(int n, String ans) {
        if (n == 0) {
            System.out.print(ans + " ");
            return;
        } else if (n < 0) return;
        
        printPATHS(n - 1, ans + "1");
        printPATHS(n - 1, ans + "2");
        printPATHS(n - 1, ans + "3");
    }
}
