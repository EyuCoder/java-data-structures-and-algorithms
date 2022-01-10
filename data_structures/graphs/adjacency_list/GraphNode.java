package data_structures.graphs.adjacency_list;

import java.util.ArrayList;

public class GraphNode {
    public char name;
    public int index;
    public boolean isVisited = false;
    public ArrayList<GraphNode> neighbors = new ArrayList<>();

    public GraphNode(char name, int index) {
        this.name = name;
        this.index = index;
    }
}
