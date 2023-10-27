import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLatter {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) {
            return 0;
        }
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        int ladder = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String cur = q.poll();
                char[] wordChars = cur.toCharArray();
                for (int j = 0; j < wordChars.length; j++) {
                    char original = wordChars[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (wordChars[j] == c) {
                            continue;
                        }
                        wordChars[j] = c;
                        String newWord = new String(wordChars);

                        if (newWord.equals(endWord)) {
                            return ladder + 1;
                        }
                        if (wordSet.contains(newWord)) {
                            q.offer(newWord);
                            wordSet.remove(newWord);
                        }
                    }
                    wordChars[j] = original;
                }
            }
            ladder++;
        }
        return 0;
    }
}
