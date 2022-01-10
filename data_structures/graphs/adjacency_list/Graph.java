package data_structures.graphs.adjacency_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {

    ArrayList<GraphNode> nodeList;

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addUndirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);
    }

    // BFS internal
    void bfsVisit(GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            for (GraphNode neighbor : currentNode.neighbors) {
                if (!neighbor.isVisited) {
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    void bfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                bfsVisit(node);
            }
        }
    }

    void dfsVisit(GraphNode node) {
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            GraphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            for (GraphNode neighbor : currentNode.neighbors) {
                if (!neighbor.isVisited) {
                    stack.push(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    void dfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                dfsVisit(node);
            }
        }
    }

    // For printing Graph to the console
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (GraphNode graphNode : nodeList) {
            s.append(graphNode.name).append(": ");
            for (int j = 0; j < graphNode.neighbors.size(); j++) {
                if (j == graphNode.neighbors.size() - 1) {
                    s.append((graphNode.neighbors.get(j).name));
                } else {
                    s.append(graphNode.neighbors.get(j).name).append(" -> ");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }
}
