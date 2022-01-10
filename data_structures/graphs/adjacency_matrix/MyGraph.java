package data_structures.graphs.adjacency_matrix;

import java.util.ArrayList;

public class MyGraph {

    public static void main(String[] args) {
        ArrayList<GraphNode> graphNodes = new ArrayList<>();
        graphNodes.add(new GraphNode('A', 0));
        graphNodes.add(new GraphNode('B', 0));
        graphNodes.add(new GraphNode('C', 0));
        graphNodes.add(new GraphNode('D', 0));
        graphNodes.add(new GraphNode('E', 0));

        Graph g = new Graph(graphNodes);
        g.addUndirectedEdge(0, 1);
        g.addUndirectedEdge(0, 2);
        g.addUndirectedEdge(0, 3);
        g.addUndirectedEdge(1, 4);
        g.addUndirectedEdge(2, 3);
        g.addUndirectedEdge(3, 4);
        System.out.println(g);
    }
}
