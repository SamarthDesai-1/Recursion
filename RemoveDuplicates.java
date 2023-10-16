public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "aaaabbbb";

        String ans = str.charAt(0) + "";

        int i = 1;

        for (int k = 0; k < str.length(); k++ ,i++) {

            char str_char = ' ';
            char ans_char = str.charAt(k);
            if (i <= str.length()) {
                str_char = str.charAt(i);
            }
            if (ans_char == str_char) {
                continue;
            } else if (ans_char != str_char) {
                ans += str_char;
            }
        }

        System.out.println(ans);
    }
}
