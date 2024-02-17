public class LemonadeChange2 {

    public static void main(String[] args) {
        int[] bills = { 5, 5, 5, 5, 20, 20, 5, 5, 20, 5 };
        int five = 0, ten = 0, twenty = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;
            } else if (bills[i] == 10) {
                if (five >= 1) {
                    ten++;
                    five--;
                } else {
                    return false;
                }
            } else {
                if (five >= 1 && ten >= 1) {
                    twenty++;
                    ten--;
                    five--;
                } else if (five >= 3) {
                    twenty++;
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
