public class Nqueens {

    public static void main(String[] args) {
        int n = 4;
        int[][] chess = new int[n][n];
        printNQUEENS(chess, "", 0);
    }

    private static void printNQUEENS(int[][] chess, String queen, int row) {
        if (row == chess.length) {
            System.out.println(queen.substring(0, queen.length() - 1));
            return;
        }
        for (int col = 0; col < chess.length; col++) {
            if (isSAFE(chess, row, col) == true) {
                chess[row][col] = 1;
                printNQUEENS(chess, queen + row + " - " + col + " ,", row + 1);
                chess[row][col] = 0;
                chess[row][col] = 0;
            }
        }
    }

    private static boolean isSAFE(int[][] chess, int row, int col) {
        for (int i = row - 1, j = col; i >= 0; i--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
}
