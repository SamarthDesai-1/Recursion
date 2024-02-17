import java.util.Scanner;
public class StringSum {

    public static int toInt(String s ,int index) {
        int sum = 0;
        if (index == s.length()) return sum;
        char ch = ' ';
        int ascii = -1;
        sum = sum + toInt(s, index + 1);
        ch = s.charAt(index);
        ascii = (int) ch;
        return sum + (ascii - 48);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        String s = sc.next();
        int index = 0;
        System.out.println("Sum : " + toInt(s, index));

    }
}
