public class Main {
    public static void main(String[] args) {
        Graph<String> graph = new Graph<>(true);
        graph.addVert("A");
        graph.addVert("B");
        graph.addVert("C");
        graph.addVert("D");

        graph.addConnect("A", "B");
        graph.addConnect("B", "C");
        graph.addConnect("C", "D");
        graph.addConnect("D", "A");
        graph.displayNetwork();
    }
}
