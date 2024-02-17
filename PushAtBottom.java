import java.util.Stack;

public class PushAtBottom {

    public static void pushAtBottom(Stack<Integer> st, int atBottom) {
        if (st.size() == 0) {
            st.push(atBottom);
            return;
        }

        int x = st.pop();
        pushAtBottom(st, atBottom);
        st.push(x);
        return;
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int atBottom = 800;
        for (int i = 1; i <= 5; i++) {
            st.push(i);
        }
        pushAtBottom(st, atBottom);
        System.out.println(st);
    }
}
