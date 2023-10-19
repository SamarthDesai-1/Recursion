public class PrintAllSubsequences {

    public static void main(String[] args) {
        String x = "abc";
        String subsequences = "";
        printSSQ(x, subsequences);
    }

    private static void printSSQ(String x, String ans) {
        if (x.equals("")) {
            System.out.print(ans + " ");
            return;
        }
        char ch = x.charAt(0);
        String ros = x.substring(1);

        printSSQ(ros, ans + "");
        printSSQ(ros, ans + ch);
    }

}
