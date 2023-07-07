package walmart;

import java.util.Stack;

public class MinStack {
    Stack<Long> st;
    Long min = Long.MAX_VALUE;

    public MinStack() {
        st = new Stack<>();
    }

    void push(int value) {
        Long val = Long.valueOf(value);
        if (st.isEmpty()) {
            st.push(val);
            min = val;
        } else {
            if (val < min) {
                st.push(2 * val - min);
                min = val;
            } else {
                st.push(val);
            }
        }
    }

    void pop() {
        if (st.isEmpty()) {
            return;
        }
        Long val = st.pop();
        if (val < min) {
            min = 2 * min - val;
        }
    }

    int top() {
        Long x = st.peek();
        if (x < min) {
            return min.intValue();
        }
        return x.intValue();
    }

    int minValue() {
        return min.intValue();
    }
}
