import java.util.Arrays;

public class CanPlaceFlowers {

    public static void main(String[] args) {
        int[] plots = { 1, 0, 0, 0, 1 };
        int n = 2;

        int count = 0;

        for (int i = 1; i < plots.length; i++) {
            if (plots[i] == 0 && (i == 0 || plots[i - 1] == 0) && (i == plots.length - 1 || plots[i + 1] == 0)) {
                count++;
                plots[i] = 1;
                if (count >= n) break;
            }
        }

        if (count >= n) System.out.println("true");
        else System.out.println("false");
    }

}
