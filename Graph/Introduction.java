package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Graph can have two types of representation 
//&& ADJACENCY MATRIX && ADJACENCY LIST
public class Introduction {

    public static void printAdjacencyMatrix(int[][]adjacencyMatrix) {
        /*matrix means array ke ander array 
        [
        [1,2,3,4] 
        [5,6,7,8] 
        [9,10,11,12]
        ](4*3) matrix  
        */
        for(int i  = 0 ; i < adjacencyMatrix.length ; i++){
            for(int j = 0 ; j < adjacencyMatrix[i].length ; j++){
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void representAdjacencyMatrix(int numNodes, int[][]edges){
         // Initialize the adjacency matrix
        int[][] adjacencyMatrix = new int[numNodes][numNodes];
        for(int[] edge : edges){
            //extract the nodes from edges
            int src = edge[0] ;
            int dest = edge[1] ;
            adjacencyMatrix[src][dest] = 1 ;

            //for undirected graph marks both the places
            adjacencyMatrix[dest][src] = 1 ;
        }

       // Print the adjacency Matrix
       System.out.println("Adjacency Matrix :");
        printAdjacencyMatrix(adjacencyMatrix);
    }

    public static void representAdjacencyList(int numNodes, int[][]edges){
        // Initialize the adjacency List
       HashMap<Integer, List<Integer>>adjacencyList = new HashMap<>() ;
       //src = u 
       //dest = v
       for(int[] edge : edges){
        int src = edge[0] ;
        int dest = edge[1] ;
        adjacencyList.putIfAbsent(src, new ArrayList<>());
        adjacencyList.get(src).add(dest) ;
       }

       // Print the adjacency list
       System.out.println("Adjacency List:");
       printAdjacencyList(adjacencyList);
   }

   // Method to print the adjacency list
    public static void printAdjacencyList(HashMap<Integer, List<Integer>> adjacencyMap) {
        for (Map.Entry<Integer, List<Integer>> entry : adjacencyMap.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (Integer neighbor : entry.getValue()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Define the number of nodes in the graph
        int numNodes = 4;

        // Define the edges
        int[][] edges = {
                { 0, 1 },
                { 1, 2 },
                { 1, 3 },
                { 1, 2 },
                { 0, 2 }
        };
        // representing through ADJACENCY LIST
        representAdjacencyMatrix(numNodes, edges);

        // representing through ADJACENCY MATRIX
        representAdjacencyList(numNodes, edges);

    }
}
