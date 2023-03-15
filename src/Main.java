public class Main {
    public static void main(String[] args) {
        Graph medicalFlowGraph = new Graph();

        String triagem = "Triagem";
        String consulta = "Consulta";
        String exames = "Exames";

        medicalFlowGraph.addVertex(triagem);
        medicalFlowGraph.addVertex(consulta);
        medicalFlowGraph.addVertex(exames);

        medicalFlowGraph.addEdge(triagem, consulta);
        medicalFlowGraph.addEdge(consulta, exames);
        medicalFlowGraph.addEdge(exames, consulta);

        medicalFlowGraph.printGraph();

        if (medicalFlowGraph.hasCycle())
            System.out.println("This graph has cycle");
        else
            System.out.println("This graph does not have cycle");
    }
}
