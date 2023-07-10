package walmart;

public class StringCompression {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        int i = 0, j = 0;
        while (j < chars.length) {
            if (chars[i] != chars[j]) {
                if (cnt == 1) {
                    sb.append(chars[i]);
                } else {
                    sb.append(chars[i]).append(cnt);
                }

                i = j;
                cnt = 0;
            } else if (chars[i] == chars[j]) {
                j++;
                cnt += 1;
            }
        }
        // handling last case which wont be handled inside of the loop
        if (cnt > 1) {
            sb.append(chars[i]).append(cnt);
        } else {
            sb.append(chars[i]);
        }

        char[] s = sb.toString().toCharArray();
        int idx = 0;
        for (char c : s) {
            chars[idx++] = c;
        }

        return sb.length();
    }
}
