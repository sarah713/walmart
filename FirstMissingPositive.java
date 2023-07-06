package walmart;

import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive {

    // optimised
    public int firstMissingPositive(int[] nums) {
        int[] ans = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            // check if val is in range
            if (val > 0 && val <= nums.length) {
                ans[val] = 1;
            }
        }

        for (int i = 1; i < ans.length; i++) {
            if (ans[i] == 0) {
                return i;
            }
        }
        return ans.length;
    }

    // your solution
    // public int firstMissingPositive(int[] nums) {
    // int max=Integer.MIN_VALUE;
    // Set<Integer> set = new HashSet<>();
    // for(int i:nums){
    // if(i>0){
    // set.add(i);
    // max = Math.max(i,max);
    // }
    // }
    // for(int i=1;i<=max;i++){
    // if(!set.contains(i)){
    // return i;
    // }
    // }
    // return max > 0 ? max+1 : 1;
    // }
}
