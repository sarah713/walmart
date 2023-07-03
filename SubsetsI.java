package walmart;

import java.util.ArrayList;
import java.util.List;

public class SubsetsI {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, 0, res, new ArrayList<>());
        return res;
    }

    public void helper(int[] nums, int idx, List<List<Integer>> res, List<Integer> cur) {
        if (idx == nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }

        // include
        cur.add(nums[idx]);
        helper(nums, idx + 1, res, cur);
        // exclude
        cur.remove(cur.size() - 1);
        helper(nums, idx + 1, res, cur);
    }
}
