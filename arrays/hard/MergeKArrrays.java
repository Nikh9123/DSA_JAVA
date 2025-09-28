package arrays.hard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class MergeKArrrays {
    public static ArrayList<Integer> mergeKArrays(int[][] arr, int K) {
        // Write your code here.
        // Write your code here.
        Map<Integer, String>map = new TreeMap<>() ;
        for(int i=0;i<K;i++){
            for(int j=0;j<arr[i].length;j++){
                map.put(arr[i][j], String.valueOf(j)+"and"+String.valueOf(i));
            }
        }
        ArrayList<Integer> result=new ArrayList<>();
        
        //traverse on map
        for(Integer ele : map.keySet()){
            result.add(ele);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 3, 5, 7 },
                { 2, 4, 6, 8 }
        };

        ArrayList<Integer> ans = mergeKArrays(arr, 2);

        for (Integer integer : ans) {
            System.out.print(integer + " ");
        }
    }
}
