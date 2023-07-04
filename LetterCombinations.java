package walmart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinations {
    private static final HashMap<Character, String> map = new HashMap<>();
    static {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) {
            return res;
        }
        helper(digits, res, 0, new StringBuilder());
        return res;
    }

    public void helper(String digits, List<String> res, int idx, StringBuilder cur) {
        if (idx == digits.length()) {
            res.add(cur.toString());
            return;
        }

        char digit = digits.charAt(idx);
        String s = map.get(digit);

        for (char c : s.toCharArray()) {
            cur.append(c);
            helper(digits, res, idx + 1, cur);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}
