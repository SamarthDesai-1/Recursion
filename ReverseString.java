public class ReverseString {
    
    public static String reverse(String s ,int index) {
        String temp = "";
        if (index == s.length()) return temp;

        return reverse(s, index + 1) + temp + s.charAt(index);
    }

    public static void main(String[] args) {
        String s = "Sam";
        System.out.println(reverse(s, 0));
    }
}
