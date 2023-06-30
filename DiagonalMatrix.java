package walmart;

public class DiagonalMatrix {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        if (mat == null || m == 0 || n == 0) {
            return new int[0];
        }
        int[] result = new int[m * n];
        int row = 0;
        int col = 0;
        int direction = 1;
        for (int i = 0; i < result.length; i++) {
            result[i] = mat[row][col];

            row -= direction;
            col += direction;

            if (row >= m) {
                row = m - 1;
                col += 2;
                direction = -direction;
            }
            if (col >= n) {
                col = n - 1;
                row += 2;
                direction = -direction;
            }
            if (row < 0) {
                row = 0;
                direction = -direction;
            }
            if (col < 0) {
                col = 0;
                direction = -direction;
            }
        }
        return result;
    }
}
