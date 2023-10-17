public class PowerOne {

    public static void main(String[] args) {
        int x = 2;
        int n = 4;

        int result = power(x, n);
        System.out.println(result);
    }

    private static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int ans = x * power(x, n - 1);
        return ans;
    }
}