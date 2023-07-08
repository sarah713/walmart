package walmart;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s.length() == 0 || s == null) {
            return s;
        }
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            String oddLength = lps(s, i, i);
            String evenLength = lps(s, i, i + 1);
            if (oddLength.length() > longest.length()) {
                longest = oddLength;
            }
            if (evenLength.length() > longest.length()) {
                longest = evenLength;
            }
        }
        return longest;
    }

    public String lps(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return s.substring(i + 1, j);
    }
}
