package RECURSION;

public class PrintArray {

    public static void print(int[] arr, int index) {
        // Termination Condition OR Base case
        if (index >= arr.length) return;
 
        // Logic OR Computation
        System.out.print(arr[index] + " ");

        // Recursive Condition
        print(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        print(arr, 0);
    }
}
