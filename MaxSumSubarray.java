package walmart;

public class MaxSumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max_till_now = 0, maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            max_till_now += nums[i];

            if (max_till_now > maxSum) {
                maxSum = max_till_now;
            }
            if (max_till_now <= 0) {
                max_till_now = 0;
            }
        }
        return maxSum;
    }
}
