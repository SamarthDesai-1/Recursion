public class PalindromeString {

    public static void main(String[] args) {
        String str = "abbx";

        boolean result = isPALINDROME(str, 0, str.length() - 1);

        System.out.println(result);

    }

    private static boolean isPALINDROME(String str, int i, int j) {
        if (i >= j) {
            return true;
        }
        if (str.charAt(i) == str.charAt(j)) {
            return isPALINDROME(str, i + 1, j - 1);
        }
        return false;
    }

}
