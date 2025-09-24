package arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[]twoSum(int[] arr, int target){
        Map<Integer, Integer>map = new HashMap<>() ;

        for(int i = 0 ; i < arr.length ; i++){

            int searchEle = target - arr[i] ;

            if(map.containsKey(searchEle)){
                return new int[]{map.get(searchEle), i} ;
            }
            map.put(arr[i], i);
        }
        
        return new int[0] ;
    }
    public  void main(String[] args) {
        int[] arr = {2,3,5,1} ;

        for (int i : twoSum(arr, 7)) {
            System.out.print(i + " ");
        }
    }
}
