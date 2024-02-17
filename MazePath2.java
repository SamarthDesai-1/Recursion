import java.util.*;

public class MazePath2 {

    static int maze(int n, int m) {
        int rightways = 0;
        int downways = 0;

        if (n == 1 && m == 1)
            return 1;
        if (n == 1) {
            rightways += maze(n, m - 1);
        }
        if (m == 1) {
            downways += maze(n - 1, m);
        }

        if (n > 1 && m > 1) {
            rightways += maze(n, m - 1);
            downways += maze(n - 1, m);
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

        System.out.println("Total ways to go to destination are : " + maze(row, col));

    }
}
