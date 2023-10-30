public class MergeStrings {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        String min = word1.length() < word2.length() ? word1 : word2;
        String max = word1.length() > word2.length() ? word1 : word2;
        for (int i = 0; i < min.length(); i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if (word1.length() != word2.length()) {
            int diff = max.length() - min.length();
            for (int i = max.length() - diff; i < max.length(); i++) {
                sb.append(max.charAt(i));
            }
        }
        return sb.toString();
    }
}
