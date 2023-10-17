public class LograthmicPower {

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
        int xpnb2 = power(x, n / 2);
        int xn = xpnb2 * xpnb2;

        if (n % 2 == 1) {
            xn *= x;
        }
        return xn;
    }
}
