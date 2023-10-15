public class CountDigits {

    public static void main(String[] args) {
        int n = 452;

        int count = countDIGIT(n);
        System.out.println(count);
    }

    private static int countDIGIT(int n) {
        int count = 0;
        if (n == 0) {
            return 0;
        }

        int lastDigit = n % 10;
        count++;
        return count + countDIGIT(n / 10);

    }
}
