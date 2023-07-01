package walmart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] sort = s.toCharArray();
            Arrays.sort(sort);
            String sorted = new String(sort);
            if (!map.containsKey(sorted)) {
                List<String> cur = new ArrayList<>();
                cur.add(s);
                map.put(sorted, cur);
            } else {
                map.get(sorted).add(s);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (List<String> i : map.values()) {
            res.add(i);
        }
        return res;
    }
}
