public class PrintMazePathsWithJumps {

    public static void main(String[] args) {
        int m = 3, n = 3;

        String paths = "";
        printPaths(1, 1, m, n, paths);
    }

    private static void printPaths(int sr, int sc, int dr, int dc, String paths) {
        if (sr == dr && sc == dc) {
            System.out.print(paths + " ");
            return;
        }

        for (int ms = 1; ms <= dc - sc; ms++) {
            printPaths(sr, sc + ms, dr, dc, paths + "H" + ms);
        }
        for (int ms = 1; ms <= dr - sr; ms++) {
            printPaths(sr + ms, sc, dr, dc, paths + "V" + ms);
        }
        for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {
            printPaths(sr + ms, sc + ms, dr, dc, paths + "D" + ms);
        }
    }
}
