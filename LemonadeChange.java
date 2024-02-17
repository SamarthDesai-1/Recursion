public class LemonadeChange {

    private static boolean returnChange(int[] bills) {
        int galla = 0;
        for (int i = 0; i < bills.length; i++) {
            if (galla == 0 && bills[i] >= 10)
                break;

            if (bills[i] == 10) {
                if (galla >= 5) {
                    galla -= 5;
                }
            } else if (bills[i] == 20) {
                if (galla >= 15) {
                    galla -= 15;
                }
            } else {
                galla += 5;
            }
        }
        return galla < 0 ? false : true;

    }

    public static void main(String[] args) {
        int[] bills = { 5, 5, 5, 5, 20, 20, 5, 5, 20, 5 };

        System.out.println(returnChange(bills));

    }
}