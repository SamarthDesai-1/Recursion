public class PrintPermutations {

    public static void main(String[] args) {
        String str = "abc";

        String permutations = "";

        printPERMUTATIONS(str, permutations);
    }

    private static void printPERMUTATIONS(String str, String permutations) {
        if (str.length() == 0) {
            System.out.println(permutations);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String leftPART = str.substring(0, i);
            String rightPART = str.substring(i + 1);
            String ros = leftPART + rightPART;
            printPERMUTATIONS(ros, permutations + ch);
        }
    }

}
