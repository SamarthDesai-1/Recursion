public class intToString {

    public static String[] array = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static StringBuilder towords(int n) {
        StringBuilder sb = new StringBuilder("");
        if (n <= 0) {
            return sb;
        }
        return sb.append(towords(n / 10)).append(array[n % 10]).append(" ");
    }

    public static void main(String[] args) {

        StringBuilder x = towords(1452);
        System.out.println(x);
    }
}
