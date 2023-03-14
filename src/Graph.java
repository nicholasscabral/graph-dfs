import java.util.*;
public class Graph {
    private final Map<String, ArrayList<String>> adj;

    public Graph() {
        adj = new HashMap<String, ArrayList<String>>();
    }

    public void addVertex(String vertex) {
        adj.putIfAbsent(vertex, new ArrayList<String>());
    }

    public void addEdge(String from, String to) {
        ArrayList<String> edges = adj.get(from);
        edges.add(to);
        adj.put(from, edges);
    }
}