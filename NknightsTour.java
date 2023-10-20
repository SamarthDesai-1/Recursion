public class NknightsTour {

    public static void main(String[] args) {
        int n = 4;
        int row = 2, col = 1;
        int[][] chess = new int[n][n];

        knightTOUR(chess, row, col, 1);
    }

    private static void knightTOUR(int[][] chess, int row, int col, int move) {
        int n = chess.length;
        if (row < 0 || col < 0 || row >= chess.length || col >= chess.length || chess[row][col] > 0)
            return;
        else if (move == (n * n)) {
            chess[row][col] = move;
            displayCHESS(chess);
            chess[row][col] = 0;
        }
        chess[row][col] = move;
        knightTOUR(chess, row - 2, col + 1, move + 1);
        knightTOUR(chess, row - 1, col + 2, move + 1);
        knightTOUR(chess, row + 1, col + 2, move + 1);
        knightTOUR(chess, row + 2, col + 1, move + 1);
        knightTOUR(chess, row + 2, col - 1, move + 1);
        knightTOUR(chess, row + 1, col - 2, move + 1);
        knightTOUR(chess, row - 1, col - 2, move + 1);
        knightTOUR(chess, row - 2, col - 1, move + 1);
        chess[row][col] = 0;
    }

    private static void displayCHESS(int[][] chess) {
        int row = chess.length;
        int col = chess[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }
}
