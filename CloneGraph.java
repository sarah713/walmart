package walmart;

import java.util.ArrayList;
import java.util.List;

public class CloneGraph {
    public Node cloneGraph(Node node) {
        if (node == null)
            return null;

        Node copy = new Node(node.val);
        Node[] visited = new Node[101];
        // fill visited with null
        dfs(node, visited, copy);
        return copy;
    }

    public void dfs(Node node, Node[] visited, Node copy) {
        visited[copy.val] = copy;
        for (Node n : node.neighbors) {
            if (visited[n.val] == null) {
                Node newNode = new Node(n.val);
                copy.neighbors.add(newNode);
                dfs(n, visited, newNode);
            } else {
                copy.neighbors.add(visited[n.val]);
            }
        }
    }
}

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}