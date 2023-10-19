import java.util.ArrayList;

public class MazePaths {

    public static void main(String[] args) {
        int m = 3, n = 3;
        ArrayList<String> result = getPATHS(1, 1, m, n);
        System.out.println(result);
    }

    private static ArrayList<String> getPATHS(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();
        if (sc < dc) {
            hpaths = getPATHS(sr, sc + 1, dr, dc);
        }
        if (sr < dr) {
            vpaths = getPATHS(sr + 1, sc, dr, dc);
        }
        ArrayList<String> paths = new ArrayList<>();
        for (String hpath : hpaths) {
            paths.add("H" + hpath);
        }
        for (String vpath : vpaths) {
            paths.add("V" + vpath);
        }
        return paths;
    }
}
