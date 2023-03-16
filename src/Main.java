public class Main {
    public static void main(String[] args) {
        Graph fluxoDeAtendimento = new Graph();

        fluxoDeAtendimento.addVertex("Entrada");
        fluxoDeAtendimento.addVertex("Triagem");
        fluxoDeAtendimento.addVertex("Consulta");

        fluxoDeAtendimento.addEdge("Entrada", "Consulta");
        fluxoDeAtendimento.addEdge("Consulta", "Triagem");
        fluxoDeAtendimento.addEdge("Triagem", "Entrada");

        fluxoDeAtendimento.printGraph();
        fluxoDeAtendimento.hasCycle();

        System.out.println();
        System.out.println();
        Graph arvoreDeDecisao = new Graph();
        arvoreDeDecisao.addVertex("Sintomas ou queixa");
        arvoreDeDecisao.addVertex("Exame físico completo");
        arvoreDeDecisao.addVertex("Checagem de pressão arterial");
        arvoreDeDecisao.addVertex("Pressão alta");
        arvoreDeDecisao.addVertex("Pressão normal");
        arvoreDeDecisao.addVertex("Realizar exames adicionais");
        arvoreDeDecisao.addVertex("Realizar tratamento de pressão alta");
        arvoreDeDecisao.addVertex("Examinar possíveis causas dos sintomas");
        arvoreDeDecisao.addVertex("Encaminhar a um especialista");
        arvoreDeDecisao.addVertex("Escolher o tratamento para o paciente");
        arvoreDeDecisao.addVertex("Finalizar consulta");

        arvoreDeDecisao.addEdge("Sintomas ou queixa", "Exame físico completo");
        arvoreDeDecisao.addEdge("Exame físico completo", "Checagem de pressão arterial");
        arvoreDeDecisao.addEdge("Checagem de pressão arterial", "Pressão alta");
        arvoreDeDecisao.addEdge("Checagem de pressão arterial", "Pressão normal");
        arvoreDeDecisao.addEdge("Pressão alta", "Realizar tratamento de pressão alta");
        arvoreDeDecisao.addEdge("Pressão normal", "Realizar exames adicionais");
        arvoreDeDecisao.addEdge("Realizar tratamento de pressão alta", "Realizar exames adicionais");
        arvoreDeDecisao.addEdge("Examinar possíveis causas dos sintomas", "Realizar exames adicionais");
        arvoreDeDecisao.addEdge("Realizar exames adicionais", "Encaminhar a um especialista");
        arvoreDeDecisao.addEdge("Realizar exames adicionais", "Escolher o tratamento para o paciente");
        arvoreDeDecisao.addEdge("Escolher o tratamento para o paciente", "Finalizar consulta");
        arvoreDeDecisao.addEdge("Encaminhar a um especialista", "Finalizar consulta");

        arvoreDeDecisao.printGraph();
        arvoreDeDecisao.hasCycle();

    }
}
