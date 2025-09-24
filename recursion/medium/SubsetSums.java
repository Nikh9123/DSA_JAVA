package recursion.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SubsetSums {

    public static List<Integer> subsetSumsIterative(int[] arr) {
        List<Integer> result = new ArrayList<>();
        result.add(0); // start with sum of empty subset
        
        for (int num : arr) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                result.add(result.get(i) + num);
            }
        }
        
        return result;
    }

    public void subsetSumsHelper(int[]arr, int sum, int i, List<Integer>list){
        if(i >= arr.length){
            list.add(sum);
            return ;
        }

        subsetSumsHelper(arr, sum + arr[i], i + 1, list);

        subsetSumsHelper(arr, sum, i + 1, list);
    }
    public List<Integer>subsetSums(int[]arr){
        int sum = 0 ;
        // Arrays.sort(arr);
        List<Integer>ans = new ArrayList<>() ;
        subsetSumsHelper(arr, sum, 0, ans) ;
        Collections.sort(ans);
        return ans ;
    }

    public void main(String[] args) {
        int[] arr = new int[]{2,3} ;
        Arrays.sort(arr);
        List<Integer>ans = subsetSums(arr);

        for (Integer ele : ans) {
            System.out.print(ele);
        }
    }
}
