public class PrintSubsequences {

    static void printSSQ(String s, String currAns) {
        if (s.length() == 0) {
            System.out.print(currAns + " ");
            return;
        }
        char curr = s.charAt(0);
        String remainString = s.substring(1);

        printSSQ(remainString, currAns + curr);
        printSSQ(remainString, currAns);
    }

    public static void main(String[] args) {
        String s = "abc";
        printSSQ(s, "");
    }
}
