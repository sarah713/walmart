package walmart;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSource {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        cur.add(0);
        dfs(graph, 0, n - 1, visited, res, cur);
        return res;
    }

    public void dfs(int[][] graph, int vertex, int target, boolean[] visited, List<List<Integer>> res,
            List<Integer> cur) {
        if (vertex == target) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i : graph[vertex]) {
            cur.add(i);
            dfs(graph, i, target, visited, res, cur);
            cur.remove(cur.size() - 1);
        }
    }
}