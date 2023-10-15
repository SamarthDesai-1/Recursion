import java.util.ArrayList;

public class PrintSubStrings {

    public static void main(String[] args) {
        String str = "Samarth";
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                list.add(str.substring(i, j));
            }
        }
        System.out.println(list);
    }
}
