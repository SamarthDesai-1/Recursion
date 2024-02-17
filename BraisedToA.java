import java.util.*;
public class BraisedToA {
    

    // Traveller is nothing it just helps the function to iterate over the recursive calls
    static int raised(int a ,int b ,int traveller) {
        int x = a;
        if (traveller == b) return x; // b is exponent if traveller value is equal to b then return 
        
        int ans = x * raised(a, b, traveller + 1); // Multiply return value with 'X' which is by default set to base power 'A'
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base value : ");        
        int a = sc.nextInt();
        System.out.print("Enter Exponent value : ");
        int b = sc.nextInt();
        System.out.println(raised(a, b, 1));
        
    }
}
