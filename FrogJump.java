public class FrogJump {

    static int bestCost(int[] h, int n, int idx) {
        if (idx == n - 1) {
            return 0;
        }
        int op1 = bestCost(h, n, idx + 1) + Math.abs(h[idx + 1] - h[idx]);
        if (idx == n - 2)
            return op1;
        int op2 = bestCost(h, n, idx + 2) + Math.abs(h[idx + 2] - h[idx]);

        return Math.min(op1, op2);
    }

    public static void main(String[] args) {
        int[] h = { 10, 30, 40, 20 };
        System.out.println("Min Cost is : " + bestCost(h, h.length, 0));
    }
}
