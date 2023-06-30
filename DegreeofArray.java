package walmart;

import java.util.HashMap;

public class DegreeofArray {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, int[]> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                // first idx,last idx,count
                map.put(nums[i], new int[] { i, i, 1 });
            } else {
                int[] arr = map.get(nums[i]);
                // update last encounter
                arr[1] = i;
                // increase cnt
                arr[2]++;
                map.put(nums[i], arr);
            }
        }

        int maxFreq = Integer.MIN_VALUE;
        int minDist = Integer.MAX_VALUE;
        for (int[] values : map.values()) {
            if (values[2] > maxFreq) {
                maxFreq = values[2];
                minDist = values[1] - values[0] + 1;
            }
            // if the freqency is eqal to curr max, we take minimum between exisiting
            // minDist and curr dist
            else if (values[2] == maxFreq) {
                minDist = Math.min(minDist, values[1] - values[0] + 1);
            }

        }
        return minDist;
    }
}
