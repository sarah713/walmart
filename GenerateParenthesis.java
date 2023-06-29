package walmart;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(n, "", 0, 0, res);
        return res;
    }

    public void helper(int n, String cur, int open, int close, List<String> res) {
        if (cur.length() == 2 * n) {
            res.add(cur);
            return;
        }
        if (open < n) {
            helper(n, cur + "(", open + 1, close, res);
        }
        if (close < open) {
            helper(n, cur + ")", open, close + 1, res);
        }
    }
}