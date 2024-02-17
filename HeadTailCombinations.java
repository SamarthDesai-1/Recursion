import java.util.*;

public class HeadTailCombinations {

    static int coins(int n) {
        int two = 2;
        if (n == 0)
            return 1;

        int combinations = two * coins(n - 1);
        return combinations;
    }

    public static void main(String[] args) {
        Scanner foo = new Scanner(System.in);
        System.out.print("Enter coins : ");
        int n = foo.nextInt();
        System.out.println("Possible Combinations are : " + coins(n));
    }
}