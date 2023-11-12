public class BrokenCalculator {
    public int brokenCalc(int startValue, int target) {
        int op = 0;
        while (target > startValue) {
            if (target % 2 == 0) {
                target /= 2;
            } else {
                target += 1;
            }
            op += 1;
        }
        return op + startValue - target;
    }
}
