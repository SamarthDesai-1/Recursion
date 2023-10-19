public class PrintMazePaths {

    public static void main(String[] args) {
        int m = 3, n = 3;
        String paths = "";
        printPATHS(1, 1, m, n, paths);
    }

    private static void printPATHS(int sr, int sc, int dr, int dc, String paths) {
        if (sr == dr && sc == dc) {
            System.out.print(paths + " ");
            return;
        }
        if (sr < dr) {
            printPATHS(sr + 1, sc, dr, dc, paths + "V");
        }
        if (sc < dc) {
            printPATHS(sr, sc + 1, dr, dc, paths + "H");
        }
    }
}
