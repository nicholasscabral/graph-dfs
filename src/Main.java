public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");

        graph.addEdge("A", "C");
        graph.addEdge("C", "B");
        graph.addEdge("B", "A");

        graph.printGraph();

        if (graph.hasCycle())
            System.out.println("This graph has cycle");
        else
            System.out.println("This graph does not have cycle");
    }
}
