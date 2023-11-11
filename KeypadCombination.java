import java.util.ArrayList;

public class KeypadCombination {

    public static void main(String[] args) {
        String number = "2";

        ArrayList<String> result = getCOMB(number);

        System.out.println(result);

    }

    private static ArrayList<String> getCOMB(String number) {
        if (number.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        int ch = number.charAt(0);
        String ros = number.substring(1);
        ArrayList<String> rres = getCOMB(ros);

        ArrayList<String> mres = new ArrayList<>();

        String codeforch = array[(ch - '0') - 1];
        for (int i = 0; i < codeforch.length(); i++) {
            for (String rstr : rres) {
                char firstChar = codeforch.charAt(i);
                mres.add(firstChar + rstr);
            }
        }
        return mres;
    }

    public static String[] array = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

}
