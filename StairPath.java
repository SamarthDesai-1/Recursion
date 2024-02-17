import java.util.*;

public class StairPath {

    static int stairPath(int n) {
        if (n == 0)
            return 1;
        else if (n < 0)
            return 0;
            
        int ans = stairPath(n - 1) + stairPath(n - 2) + stairPath(n - 3);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value : ");
        int n = sc.nextInt();

        System.out.println("There are " + stairPath(n) + " ways to go at top.");

    }
}