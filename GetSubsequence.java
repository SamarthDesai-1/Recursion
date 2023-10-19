import java.util.ArrayList;

public class GetSubsequence {

    public static void main(String[] args) {
        String str = "abc";

        ArrayList<String> result = getSSQ(str);
        System.out.println(result);
    }

    private static ArrayList<String> getSSQ(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getSSQ(ros); 

        ArrayList<String> mres = new ArrayList<>();

        for (String rstr : rres) {
            mres.add("" + rstr);
        }
        for (String rstr : rres) {
            mres.add(ch + rstr);
        }

        return mres;
    }

}
