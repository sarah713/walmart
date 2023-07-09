package walmart;

public class KthSmallestInMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int lo = matrix[0][0], hi = matrix[n - 1][n - 1];
        int cnt = 0, tmp = n - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            for (int i = 0; i < n; i++) {
                while (tmp >= 0 && matrix[i][tmp] > mid) {
                    tmp--;
                }
                cnt += (tmp + 1);
            }
            if (cnt < k) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}
