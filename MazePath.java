import java.util.*;

public class MazePath {

    static int maze(int cr, int cc, int er, int ec) {
        int rightways = 0;
        int downways = 0;

        if (cr == er && cc == ec)
            return 1;
        if (cr == er) { // only rightways calls
            rightways += maze(cr, cc + 1, er, ec);
        }
        if (cc == ec) { // only downways calls
            downways += maze(cr + 1, cc, er, ec);
        }

        if (cr < er && cc < ec) {
            rightways += maze(cr, cc + 1, er, ec);
            downways += maze(cr + 1, cc, er, ec);
        }

        int total = rightways + downways;
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row : ");
        int row = sc.nextInt();
        System.out.print("Enter column : ");
        int col = sc.nextInt();

        System.out.println("Total ways to go to destination are : " + maze(1, 1, row, col));

    }
}
