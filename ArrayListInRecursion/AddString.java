package ArrayListInRecursion;

import java.util.ArrayList;
import java.util.List;

public class AddString {

    public static void main(String[] args) {
        String str = "Samarth";

        List<String> output = new ArrayList<>();
        addSTR(str ,output ,0);

        System.out.println(output);
    }

    private static void addSTR(String str, List<String> output, int i) {
        if (i == str.length()) return;
        addSTR(str, output, i + 1);
        output.add(str.charAt(i) + "");
    }
    
}
