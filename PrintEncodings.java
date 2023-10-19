public class PrintEncodings {

    public static void main(String[] args) {
        String number = "123";
        String encodings = "";

        printECODINGS(number, encodings);
    }

    private static void printECODINGS(String number, String encodings) {
        if (number.length() == 0) {
            System.out.println(encodings);
            return;
        } else if (number.length() == 1) {
            char ch = number.charAt(0);
            if (ch == '0') {
                return;
            } else {
                int chv = ch - '0';
                char code = (char) ('a' + chv - 1);
                System.out.println(encodings + code);
            }
        } else {
            char ch = number.charAt(0);
            String ros = number.substring(1);

            if (ch == '0') {
                return;
            } else {
                int chv = ch - '0';
                char code = (char) ('a' + chv - 1);
                printECODINGS(ros, encodings + code);
            }

            String ch12 = number.substring(0, 2);
            String ros12 = number.substring(2);

            int ch12v = Integer.parseInt(ch12);
            if (ch12v <= 26) {
                char code = (char) ('a' + ch12v - 1);
                printECODINGS(ros12, encodings + code);
            }
        }
    }
}
