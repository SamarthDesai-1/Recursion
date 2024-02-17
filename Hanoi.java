public class Hanoi {

    public static int move(int n, char s, char d, char a) {
        if (n == 1 || n == 0) return n;

        int step1 = move(n - 1, s, a, d);
        int step2 = 1;
        int step3 = move(n - 1, a, d, s);

        return step1 + step2 + step3;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(move(n, 's', 'd', 'a'));

    }
}
