package walmart;

import java.util.ArrayList;

public class LeftViewBT {
    int maxLevel = 0;

    ArrayList<Integer> leftView(TreeNode root) {
        ArrayList<Integer> leftView = new ArrayList<>();
        helper(root, 1, leftView);
        return leftView;
    }

    void helper(TreeNode root, int level, ArrayList<Integer> res) {
        if (root == null) {
            return;
        }
        if (level > maxLevel) {
            res.add(root.val);
            level = maxLevel;
        }

        helper(root.left, level + 1, res);
        helper(root.right, level + 1, res);
    }
}
