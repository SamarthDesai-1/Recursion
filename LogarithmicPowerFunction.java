import java.util.*;

public class LogarithmicPowerFunction {

    static int power(int a, int b) {
        if (b == 1)
            return a;
        else if (b == 0)
            return 1;

        int x = power(a, b / 2);
        if (b % 2 == 0)
            return x * x;
        else
            return x * x * x;
    }

    public static void main(String[] args) {
        Scanner foo = new Scanner(System.in);
        System.out.print("Enter base : ");
        int a = foo.nextInt();
        System.out.print("Enter exponent : ");
        int b = foo.nextInt();
        System.out.println(a + " raised to power " + b + " is : " + power(a, b));
    }
}
