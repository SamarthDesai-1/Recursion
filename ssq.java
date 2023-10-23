public class ssq {
    public static void main(String[] args) {
        String str = "abc";
        printssq(str ,"");
    }

    private static void printssq(String str ,String ssq) {
        if (str.length() == 0) {
            System.out.println(ssq);
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);

        printssq(ros ,ssq + ch);
        printssq(ros ,ssq);
    }
}