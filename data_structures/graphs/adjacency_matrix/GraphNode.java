package data_structures.graphs.adjacency_matrix;

public class GraphNode {
    public char name;
    public int index;
    public boolean isVisited = false;

    public GraphNode(char name, int index) {
        this.name = name;
        this.index = index;
    }
}
