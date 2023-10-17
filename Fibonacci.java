public class Fibonacci {

    public static void main(String[] args) {
        int n = 6;

        int result = fib(n);
        System.out.println("Fibonacci " + n + "th term is : " + result);
    }

    private static int fib(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int ans = fib(n - 1) + fib(n - 2);
        return ans;
    }
}
