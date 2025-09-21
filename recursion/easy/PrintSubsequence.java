package recursion.easy;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequence {
    public static void printAllSubsequenceIterative(int[]arr){
        List<ArrayList<Integer>> subsequence = new ArrayList<>();
        subsequence.add(new ArrayList<>());

        
    }
    
    public static void print(List<Integer>arr){
        System.out.print("[ ");
        for(int i = 0 ; i < arr.size() ; i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.print("]");
        System.out.println();
    }
    void printAllSubsequenceRecursive(int i , int[]arr, List<Integer>ans){
        if(i >= arr.length){
            print(ans);
            return ;
        }

        ans.add(arr[i]);
        printAllSubsequenceRecursive(i+1, arr, ans);

        ans.removeLast();
        printAllSubsequenceRecursive(i+1, arr, ans);

    }
    public void main(String[] args){
        // printAllSubsequenceIterative(new int[]{1,2,3});
        printAllSubsequenceRecursive(0, new int[]{3,1,2}, new ArrayList<>());
    }
}
