public class PrintStringInReverse {

    public static void main(String[] args) {
        String str = "Samarth";

        printREV(str ,0);
    }

    private static void printREV(String str, int i) {
        if (i == str.length()) return;
        printREV(str, i + 1);
        System.out.print(str.charAt(i));
    }
    
}
