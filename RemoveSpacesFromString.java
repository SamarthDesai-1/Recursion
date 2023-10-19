import java.util.*;

public class RemoveSpacesFromString {

    public static void main(String[] args) {
        try (Scanner foo = new Scanner(System.in)) {
            System.out.print("Enter String : ");
            String x = foo.nextLine();
            String newString = removeSPACES(x, 0);
            System.out.println(newString);
        }
    }

    private static String removeSPACES(String x, int i) {
        if (i == x.length()) {
            return "";
        }
        String ans = "";
        char ch = x.charAt(i);
        if (ch != ' ') {
            ans += ch;
        }
        ans += removeSPACES(x, i + 1);
        return ans;
    }
}
