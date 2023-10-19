import java.util.ArrayList;

public class GetStairsPath {

    public static void main(String[] args) {
        int n = 4;

        ArrayList<String> result = getPATHS(n);
        System.out.println(result);
    }

    private static ArrayList<String> getPATHS(int n) {
        if (n == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        } else if (n < 0) {
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }

        ArrayList<String> path1 = getPATHS(n - 1);
        ArrayList<String> path2 = getPATHS(n - 2);
        ArrayList<String> path3 = getPATHS(n - 3);

        ArrayList<String> paths = new ArrayList<>();

        for (String path : path1) {
            paths.add(1 + " " + path);
        }
        for (String path : path2) {
            paths.add(2 + " " + path);
        }
        for (String path : path3) {
            paths.add(3 + " " + path);
        }

        return paths;
    }
}
