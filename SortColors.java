package walmart;

public class SortColors {
    public void sortColors(int[] nums) {
        int zero = 0, one = 0, two = nums.length - 1;
        while (one <= two) {
            if (nums[one] == 0) {
                int tmp = nums[one];
                nums[one] = nums[zero];
                nums[zero] = tmp;
                zero++;
                one++;
            } else if (nums[one] == 2) {
                int tmp = nums[one];
                nums[one] = nums[two];
                nums[two] = tmp;
                two--;
            } else {
                one++;
            }

        }
    }
}
