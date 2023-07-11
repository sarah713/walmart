package walmart;

import java.util.Stack;

public class LargestRectangle {

    public int largestRectangleArea(int[] histo) {
        Stack<Integer> st = new Stack<>();
        int n = histo.length;
        int maxArea = 0;
        for (int i = 0; i <= n; i++) {
            while (!st.isEmpty() && (i == n || histo[st.peek()] >= histo[i])) {
                int height = st.peek();
                st.pop();

                int width;
                if (st.isEmpty()) {
                    width = i;
                } else {
                    width = i - st.peek() - 1;
                }

                maxArea = Math.max(maxArea, height * width);
            }
            st.push(i);
        }
        return maxArea;
    }
}
