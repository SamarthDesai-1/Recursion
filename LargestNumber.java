import java.util.*;

public class LargestNumber {

    public static void main(String[] args) {
        int[] nums = { 10, 2 };

        String[] strArr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            strArr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strArr ,(a ,b) -> (b + a).compareTo(a + b));

        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }

        String result = sb.toString();

        System.out.println(result.startsWith("0") ? "0" : result);
        
    }

}
