package walmart;

public class FindPeakElement {
    public int findPeakElement(int[] arr) {
        int max = arr[0];
        int max_idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                max_idx = i;
            }
        }
        return max_idx;
    }
}
