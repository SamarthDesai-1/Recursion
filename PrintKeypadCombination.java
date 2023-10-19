public class PrintKeypadCombination {

    public static void main(String[] args) {
        String number = "23";
        String combinations = "";

        printKEYPAD(number, combinations);

    }

    private static void printKEYPAD(String number, String ans) {
        if (number.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        char ch = number.charAt(0);
        String ros = number.substring(1);
        String codeforch = array[ch - '0'];
        for (int i = 0; i < codeforch.length(); i++) {
            char firstChar = codeforch.charAt(i);
            printKEYPAD(ros, ans + firstChar);
        }
    }

    public static String[] array = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
}
