import java.util.ArrayList;

public class FillArrayListAndDeleteFromArrayList {

    public static void main(String[] args) {
        ArrayList<String> stral = new ArrayList<>();

        String str = "Samarth";
        int start = 0;

        fillAL(str, stral, start);

    }

    private static void fillAL(String str, ArrayList<String> stral, int start) {
        if (start == str.length()) {
            return;
        }
        char ch = str.charAt(start);

        stral.add(ch + "");
        System.out.println(stral);

        fillAL(str, stral, start + 1);

        stral.remove(start);
        System.out.println(stral);
    }
}
