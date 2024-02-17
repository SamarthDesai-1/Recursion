import java.util.*;
public class IntegerToString {

    public static String[] arr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static StringBuilder intTostr(int n) {
        StringBuilder sb = new StringBuilder("");
        if (n <= 0) return sb;

        return sb.append(intTostr(n / 10)).append(arr[n % 10]).append(" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = sc.nextInt();
        System.out.println(intTostr(number));
    }
}
