package recursion.easy;

import java.util.ArrayList;
import java.util.List;

public class CountSumKSubsequence {
    static int printSum(List<Integer>list, int arr[], int n, int sum, int target, int i){
        if(i == n){
            if(sum == target) return 1 ;
            else return 0 ;
        }

        
        list.add(arr[i]);
        sum += arr[i];
        int l = printSum(list, arr, n, sum, target, i+1);

        list.remove(list.size()-1);
        sum -= arr[i];
        int r = printSum(list, arr, n, sum, target, i+1);
        return l + r ;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 1};

        int n = 3 ;
        int sum = 2 ;
        System.out.println(printSum(new ArrayList<>(), arr, n, 0, sum, 0));
    }
}
