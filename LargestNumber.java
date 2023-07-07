package walmart;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        // custom comparator
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); // descending
            }
        });

        if (str[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s);
        }
        return sb.toString();
    }
}
