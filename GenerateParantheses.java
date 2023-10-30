import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses {
    
    public static void main(String[] args) {
        int n = 3;
        List<String> result = new ArrayList<>();
        findAll("(" ,1,0,n,result);
        System.out.println(result);
    }

    private static void findAll(String string, int o, int c, int n, List<String> result) {
        if (string.length() == (2 * n)) {
            result.add(string);
            return;
        }
        if (o < n) findAll(string + "(", o + 1, c, n, result);
        if (c < o) findAll(string + ")", o, c + 1, n, result);
    }
}

// o = open bracket
// c = close bracket
