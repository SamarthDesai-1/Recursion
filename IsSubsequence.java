public class IsSubsequence {

    public static void main(String[] args) {
        String str = "abc";
        String x = "ahbgdc";

        String subsequences = "";
        System.out.println(isSubsequences(str, x, subsequences));
    }

    private static boolean isSubsequences(String str, String x, String subsequences) {
        if (x.equals("")) {
            if (subsequences.equals(str)) {
                return true;
            }
            return false;
        }

        char ch = x.charAt(0);
        String ros = x.substring(1);

        boolean result1 = isSubsequences(str, ros, subsequences + ch);
        boolean result2 = isSubsequences(str, ros, subsequences + "");

        return result1 || result2;
    }

}
