import java.util.*;

public class CountVowels {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = "aeiou";
            int count = 0;
            int stop = 0;
            int ans = countVOWELS(str, count, stop);

            System.out.println("Number of Vowels : " + ans);
        }
    }

    private static int countVOWELS(String str, int count, int stop) {
        if (stop == str.length()) {
            return 0;
        }
        char character = str.charAt(stop);
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            return 1 + countVOWELS(str, count, stop + 1);
        } else {
            return countVOWELS(str, count, stop + 1);
        }
    }
}
