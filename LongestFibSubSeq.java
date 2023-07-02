package walmart;

import java.util.HashMap;
import java.util.Map;

public class LongestFibSubSeq {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length, maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = arr[i];
                int b = arr[j];
                int k = 2;
                while (map.containsKey(a + b)) {
                    int c = a + b;
                    a = b;
                    b = c;
                    k++;
                }
                maxLen = Math.max(maxLen, k);
            }
        }
        return maxLen == 2 ? 0 : maxLen;
    }
}
