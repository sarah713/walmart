import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        pascalsTriangle.add(first);
        for (int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            List<Integer> prev = pascalsTriangle.get(i - 1);
            temp.add(1);
            for (int j = 1; j < i; j++) {
                temp.add(prev.get(j - 1) + prev.get(j));
            }
            temp.add(1);
            pascalsTriangle.add(temp);

        }
        return pascalsTriangle;
    }
}
