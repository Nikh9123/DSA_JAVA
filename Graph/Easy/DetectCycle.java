package Graph.Easy ;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DetectCycle {

        //Iterative method using DFS
        boolean isCycleDFS(List<ArrayList<Integer>> adj, boolean visited[], int parent) {
        int u = 0 ;
        Stack<ArrayList<Integer>> stack = new Stack<>();
    
        ArrayList<Integer> nodes = new ArrayList<>();
        nodes.add(u);
        nodes.add(parent);
        stack.push(nodes);
    
        while (!stack.isEmpty()) {
            List<Integer> values = stack.pop();
            int node = values.get(0);
            int par = values.get(1);
    
            if (!visited[node]) {
                visited[node] = true;
    
                List<Integer> adjVertices = adj.get(node);
    
                for (int i = 0; i < adjVertices.size(); i++) {
                    int neighbor = adjVertices.get(i);
                    if (!visited[neighbor]) {
                        ArrayList<Integer> next = new ArrayList<>();
                        next.add(neighbor);
                        next.add(node);
                        stack.push(next);
                    } else if (neighbor != par) {
                        // If the neighbor is visited and not parent, cycle detected
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    boolean isCycleDFS(List<ArrayList<Integer>>adj, boolean visited[], int u, int parent){
        visited[u] = true ;

        for(Integer node : adj.get(u)){
            if(node != parent){
                return true ;
            }
            if(isCycleDFS(adj, visited, node, u)) return true ;
        }

        return false ;
    }

    boolean isCycleBFSIterative(){
        return false ;
    }

    boolean isCycleBFSRecursive(){
        return false ;
    }

    public void main(String[] args) {
        //undirected graph
        int edges[][] = {
            {0,1},
            {1,0},
            {1,2},
            {2,1},
            {1,4},
            {4,1},
            {4,3},
            {3,4},
            {3,2},
            {2,3}
            };

        List<ArrayList<Integer>>adj = new ArrayList<>() ;

        for(int i = 0 ; i < edges.length ; i++){
            adj.add(new ArrayList<Integer>());
        }

        for(int i = 0 ; i < edges.length ; i++){
            int node1 = edges[i][0] ;
            int node2 = edges[i][1] ;

            System.out.print("u : " + node1 + " and " + "v : " + node2 + "\n");

            adj.get(node1).add(node2);
            // adj.get(node2).add(node1);
        }
        
        //print adjacency list
        int i = 0 ;
        for (ArrayList<Integer> arrayList : adj) {
            System.out.print(i + " : ");
            for (int node : arrayList) {
                System.out.print(node + " ");
            }
            i++ ;
            System.out.println();
        }
        
        boolean visited[] = new boolean[adj.size()] ;
        System.out.println(isCycleDFS(adj, visited, -1));//iterative
        System.out.println(isCycleDFS(adj, visited, 0, -1));//recursive
    }
}
