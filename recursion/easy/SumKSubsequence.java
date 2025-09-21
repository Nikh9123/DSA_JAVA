package recursion.easy;

import java.util.ArrayList;
import java.util.List;

public class SumKSubsequence {

    int subsequenceWithSumK(int arr[], int i, int sum, List<Integer> ans, int k) {
        if (i >= arr.length) {
            if (sum == k) {
                
                PrintSubsequence.print(ans);
                return 1 ;
            }
            return 0 ;
        }
        
        // if(flag == false)
        ans.add(arr[i]);
        // System.out.println("sum =  " + (sum + arr[i]));
        int pick = subsequenceWithSumK(arr, i + 1, sum + arr[i], ans, k) ;

        ans.removeLast();
        // System.out.println("sum = " + (sum + ans.removeLast()));
        int notPick = subsequenceWithSumK(arr, i + 1, sum, ans, k) ;

        return pick + notPick ;

    }

    public void main(String[] args) {

        System.out.println(subsequenceWithSumK(new int[] { 1, 2, 1 }, 0, 0, new ArrayList<>(), 2));
    }
}
