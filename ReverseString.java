package walmart;

public class ReverseString {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int wordEnd = s.length();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                wordEnd = i;
            } else if (i == 0 || s.charAt(i - 1) == ' ') {
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append(s, i, wordEnd);
            }
        }
        return sb.toString();
    }
}
