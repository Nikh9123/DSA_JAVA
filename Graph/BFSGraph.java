package Graph;

import java.util.*;

public class BFSGraph {
    public void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();

        adjacencyList.add(new ArrayList<>(Arrays.asList(1, 2)));
        adjacencyList.add(new ArrayList<>(Arrays.asList(0, 3, 4)));
        adjacencyList.add(new ArrayList<>(Arrays.asList(0, 4)));
        adjacencyList.add(new ArrayList<>(Arrays.asList(1, 4, 5)));
        adjacencyList.add(new ArrayList<>(Arrays.asList(3, 5)));
        adjacencyList.add(new ArrayList<>(Arrays.asList(3, 4)));

        List<Integer> result = bfs(adjacencyList);

        for (int ele : result) {
            System.out.print(ele + " ");
        }

        boolean visited[] = new boolean[adjacencyList.size()];
        ArrayList<Integer> ans = new ArrayList<>();
        // List<Integer> resultRecursive = bfsRecursive(adjacencyList, visited, 0, ans);

    }

    public List<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        boolean visited[] = new boolean[adj.size()];

        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        int startNode = 0;
        List<Integer> resultBFS = new ArrayList<>();
        Queue<Integer> unvisitedNode = new LinkedList<>();

        unvisitedNode.add(startNode);

        while (!unvisitedNode.isEmpty()) {

            int node = unvisitedNode.remove();

            if (!visited[node]) {
                visited[node] = true;

                resultBFS.add(node);

                ArrayList<Integer> neighborNodeList = adj.get(node);

                for (int i = 0; i < neighborNodeList.size(); i++) {
                    int neighborNode = neighborNodeList.get(i);

                    if (!visited[neighborNode]) {
                        unvisitedNode.add(neighborNode);
                    }
                }
            }
        }

        return resultBFS;
    }

    public List<Integer> bfsRecursive(ArrayList<ArrayList<Integer>> adj, boolean visited[], ArrayList<Integer> ans,
            int u) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(u);

        visited[u] = true;
        ans.add(u);
        bfsRecursiveHelper(adj, visited, ans, queue, u);
        return ans;

    }

    public void bfsRecursiveHelper(ArrayList<ArrayList<Integer>> adj, boolean visited[], ArrayList<Integer> ans,
            Queue<Integer> queue, int u) {
        if (!visited[u]) {
            visited[u] = true;
            queue.add(u);
            ans.add(u);
            return;
        }
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int v : adj.get(node)) {
                bfsRecursiveHelper(adj, visited, ans, queue, v);
            }
        }

    }
}
