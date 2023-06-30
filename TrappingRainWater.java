package walmart;

public class TrappingRainWater {
    public int trap(int[] height) {
        int water = 0;
        int left = 0, right = height.length - 1, leftMax = 0, rightMax = 0;
        while (left <= right) {
            if (height[left] < height[right]) {
                if (leftMax > height[left]) {
                    water += leftMax - height[left];
                }
                leftMax = Math.max(leftMax, height[left]);
                left++;
            } else {
                if (rightMax > height[right]) {
                    water += rightMax - height[right];
                }
                rightMax = Math.max(rightMax, height[right]);
                right--;
            }

        }
        return water;
    }
}
