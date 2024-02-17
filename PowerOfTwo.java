public class PowerOfTwo {
    


    public static long pow(long n) {
        long two = 2;
        if (n == 0) return 1;
        else if (n == 1) return two;

        return pow(n - 1) * two;
    }

    public static void main(String[] args) {
        long n = 2;
        System.out.println(pow(n));
    }
}

