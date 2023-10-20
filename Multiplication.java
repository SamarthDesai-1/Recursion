import java.util.*;

public class Multiplication {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in);) {
            System.out.print("Enter Number : ");

            int n = input.nextInt();
            final int iterator = 1;
            final int range = 10;

            printMUL(n, iterator, range);
        }

    }

    private static void printMUL(int n, int iterator, int range) {
        int ans = n * iterator;
        if (iterator == range) {
            System.out.println(n + " * " + iterator + " = " + ans);
            return;
        }
        System.out.println(n + " * " + iterator + " = " + ans);
        printMUL(n, iterator + 1, range);
    }
}
