import java.util.ArrayList;

public class FindAllIndices {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 1 };
        int key = 2;
        int idx = 0;
        ArrayList<Integer> result = new ArrayList<>();

        findINDICES(arr, idx, key, result);

        System.out.println("All Indices are : " + result);
    }

    private static void findINDICES(int[] arr, int idx, int key, ArrayList<Integer> ans) {
        if (idx == arr.length)
            return;

        if (arr[idx] == key)
            ans.add(idx);

        findINDICES(arr, idx + 1, key, ans);
    }
}

