package walmart;

public class MultiplyString {
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();

        int[] result = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int dig1 = num1.charAt(i) - '0';
                int dig2 = num2.charAt(j) - '0';

                int product = dig1 * dig2;

                int p1 = i + j; // idx of the cur digit in the result
                int p2 = i + j + 1; // idx of the next digit in the result

                int sum = product + result[p2];

                result[p1] += sum / 10;
                result[p2] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int d : result) {
            if (!(sb.length() == 0 && d == 0)) {
                sb.append(d);
            }
        }
        return sb.toString();
    }
}
