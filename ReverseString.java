public class ReverseString {

    public static void main(String[] args) {
        String str = "Samarth";

        String x = reverse(str, str.length() - 1);

        System.out.println(x);

    }

    private static String reverse(String str, int index) {
        if (index == 0) {
            return "" + str.charAt(index);
        }
        String ans = "";
        ans += str.charAt(index);
        return ans + reverse(str, index - 1);
    }
}
