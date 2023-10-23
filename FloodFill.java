public class FloodFill {

    public static void main(String[] args) {
        int n = 6, m = 7;
        int[][] maze = {
                { 0, 1, 0, 0, 0, 0, 0 },
                { 0, 1, 0, 1, 1, 1, 0 },
                { 0, 0, 0, 0, 0, 0, 0 },
                { 1, 0, 1, 1, 0, 1, 1 },
                { 1, 0, 1, 1, 0, 1, 1 },
                { 1, 0, 0, 0, 0, 0, 0 }
        };
        boolean[][] isVisited = new boolean[n][m];
        findWAYS(maze, 0, 0, "", isVisited);
    }

    private static void findWAYS(int[][] maze, int i, int j, String string, boolean[][] isVisited) {
        if (i < 0 || j < 0 || i == maze.length || j == maze[0].length || maze[i][j] == 1 || isVisited[i][j] == true) {
            return;
        }
        if (i == maze.length - 1 && j == maze[0].length - 1) {
            System.out.println(string);
            return;
        }
        isVisited[i][j] = true;
        findWAYS(maze, i - 1, j, string + "T", isVisited);
        findWAYS(maze, i, j - 1, string + "L", isVisited);
        findWAYS(maze, i + 1, j, string + "D", isVisited);
        findWAYS(maze, i, j + 1, string + "R", isVisited);
        isVisited[i][j] = false;
    }
}

