package RECURSION;

public class NthSum {
    

    public static int sum(int n) {
        // Termination Condition OR Base case
        if (n == 0) return 0;

        // Recursive Condition
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }
}
