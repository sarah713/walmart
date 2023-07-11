package walmart;

public class CalculatorII {
    public int calculate(String s) {
        char sign = '+';
        int preSum = 0;
        int num = 0;
        int lastNum = 0;

        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                num = num * 10 + (c - '0');
            } else if (c != ' ') {
                switch (sign) {
                    case '+' -> {
                        preSum += lastNum;
                        lastNum = num;
                    }
                    case '-' -> {
                        preSum += lastNum;
                        lastNum = -num;
                    }
                    case '*' ->
                        lastNum *= num;
                    case '/' ->
                        lastNum /= num;

                }
                num = 0;
                sign = c;
            }
        }
        switch (sign) {
            case '+' -> {
                preSum += lastNum;
                lastNum = num;
            }
            case '-' -> {
                preSum += lastNum;
                lastNum = -num;
            }
            case '*' ->
                lastNum *= num;
            case '/' ->
                lastNum /= num;
        }
        return preSum + lastNum;
    }
}
