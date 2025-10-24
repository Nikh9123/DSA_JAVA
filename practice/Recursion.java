package practice;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
    void getAllSubsequence(int arr[], List<List<Integer>> ans, List<Integer> list, int i) {
        if (i >= arr.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(arr[i]);

        getAllSubsequence(arr, ans, list, i + 1);

        list.remove(list.size() - 1);
        getAllSubsequence(arr, ans, list, i + 1);
    }

    void getSubsequenceSumK(int k, int i, List<Integer> list, List<List<Integer>> ans, int arr[], int sum) {
        if (i >= arr.length) {
            if (sum == k) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        // pick element only if it's not bigger than k
        if (arr[i] <= k) {
            list.add(arr[i]);
            getSubsequenceSumK(k, i + 1, list, ans, arr, sum + arr[i]);
            list.remove(list.size() - 1);
        }
        getSubsequenceSumK(k, i + 1, list, ans, arr, sum);
    }

    public void main(String[] args) {
        int arr[] = new int[] { 1, 2, 1 };
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        getSubsequenceSumK(2, 0, list, ans, arr, 0);

        for (List<Integer> lists : ans) {
            for (int ele : lists) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
