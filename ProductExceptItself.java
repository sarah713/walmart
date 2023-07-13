package walmart;

public class ProductExceptItself {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        int prod = 1;
        left[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prod = prod * nums[i - 1];
            left[i] = prod;
        }

        prod = 1;
        right[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            prod = prod * right[i + 1];
            right[i] = prod;
        }
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            res[i] = left[i] * right[i];
        }
        return res;
    }
}
