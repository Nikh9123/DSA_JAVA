package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class DFSGraph {

    // Iterative method
    private static List<Integer> dfsGraph(Map<Integer, List<Integer>> adjacencyList, List<Integer> dfsList,
            int startNode, boolean visited[]) {

        Stack<Integer> unvisitedNode = new Stack<Integer>();

        unvisitedNode.push(startNode);

        while (!unvisitedNode.empty()) {

            int node = unvisitedNode.pop();

            if (!visited[node]) {
                visited[node] = true;
                dfsList.add(node);
                List<Integer> neighborVertices = adjacencyList.get(node);

                for (int i = neighborVertices.size() - 1; i >= 0; i--) {
                    int neighborVertice = neighborVertices.get(i);

                    if (!visited[neighborVertice]) {
                        unvisitedNode.push(neighborVertice);
                    }
                }
            }
        }

        return dfsList;
    }

    // Recursive method
private static void dfsHelper(List<ArrayList<Integer>> adjacencyList, 
                              List<Integer> result, 
                              int startNode,
                              boolean visited[]) {

    // Base case: if already visited, just return
    if (visited[startNode]) {
        return;
    }

    // Mark as visited
    visited[startNode] = true;

    // Add current node to the result (DFS traversal order)
    result.add(startNode);

    // Explore all neighbors
    for (int neighborNode : adjacencyList.get(startNode)) {
        if (!visited[neighborNode]) {
            dfsHelper(adjacencyList, result, neighborNode, visited);
        }
    }
}

    // recursive method
    private static List<Integer> dfsGraph(List<ArrayList<Integer>> adjacencyList, List<Integer> result, int startNode) {
        boolean visited[] = new boolean[adjacencyList.size()];
        dfsHelper(adjacencyList, result, startNode, visited);
        return result;
    }

    public static void main(String[] args) {
        int[][] edges = {
                { 1, 2 },
                { 1, 4 },
                { 2, 3 },
                { 2, 6 },
                { 4, 5 },
                { 5, 6 }
        };

        // Build adjacency list with hashMap
        Map<Integer, List<Integer>> adjacencyList = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adjacencyList.putIfAbsent(u, new ArrayList<>());
            adjacencyList.putIfAbsent(v, new ArrayList<>()); // add reverse if undirected
            adjacencyList.get(u).add(v);
            adjacencyList.get(v).add(u); // <-- optional if graph is undirected
        }

        // Find max node number
        int maxNode = 0;
        for (int[] edge : edges) {
            maxNode = Math.max(maxNode, Math.max(edge[0], edge[1]));
        }
        boolean visitedNode[] = new boolean[maxNode + 1];

        List<Integer> result = new ArrayList<>();
        // call Iterative DFS method
        result = dfsGraph(adjacencyList, result, 1, visitedNode);

        for (int ele : result) {
            System.out.print(ele + " ");
        }
        System.out.println();
        // You can build an adjacency list using ArrayList as shown below:
        List<ArrayList<Integer>> adjacencyListArray = new ArrayList<>();
        for (int i = 0; i <= maxNode; i++)
            adjacencyListArray.add(new ArrayList<>());
        for (int[] edge : edges) {
            adjacencyListArray.get(edge[0]).add(edge[1]);
            adjacencyListArray.get(edge[1]).add(edge[0]);
        }

        result = dfsGraph(adjacencyListArray, result, maxNode);
        for (int ele : result) {
            System.out.print(ele + " ");
        }
    }
}
