public class UniquePath2 {

    public static void main(String[] args) {
        int[][] grid = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
        int row = grid.length;
        int col = grid[0].length;

        int ans = countWays(grid, 0, 0);
        System.out.println(ans);

    }

    private static int countWays(int[][] grid, int i, int j) {

        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] == 1) {
            return 0;
        }
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return 1;
        }

        int rightways = countWays(grid, i, j + 1);
        int downways = countWays(grid, i + 1, j);

        return rightways + downways;

    }
}
