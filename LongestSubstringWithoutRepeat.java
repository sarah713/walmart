package walmart;

import java.util.HashSet;

public class LongestSubstringWithoutRepeat {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int maxLen = 0;
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0;
        while (left < s.length() && right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right++));
                maxLen = Math.max(maxLen, right - left);
            } else {
                set.remove(s.charAt(left++));
            }
        }
        return maxLen;
    }
}
