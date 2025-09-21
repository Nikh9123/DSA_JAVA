package recursion.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum {
    public void combinationSumHelper(int[] candidates, List<Integer> list, List<List<Integer>> ans, int i, int target) {
        if (i >= candidates.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(list));// list
            }
            return;
        }

        if (target >= candidates[i]) {
            // list me add krna hai (pick)
            list.add(candidates[i]);
            combinationSumHelper(candidates, list, ans, i, target - candidates[i]);

            list.removeLast();
        }
        combinationSumHelper(candidates, list, ans, i + 1, target);
    }

    void combinationSumHelper2(int[] candidates, List<Integer> list, List<List<Integer>> ans, int start, int target) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return ;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start  && candidates[i] == candidates[i - 1]) continue ;
            if (candidates[i] > target) break;
            list.add(candidates[i]);
            combinationSumHelper2(candidates, list, ans, i+1, target - candidates[i]);
            list.removeLast();
        }
    }

    void combinationSumHelper2(int[] candidates, List<Integer> list, Set<List<Integer>> ans, int i, int target) {
        if (i >= candidates.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if (target >= candidates[i]) {
            list.add(candidates[i]);
            combinationSumHelper2(candidates, list, ans, i + 1, target - candidates[i]);
            list.removeLast();
        }
        combinationSumHelper2(candidates, list, ans, i + 1, target);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        combinationSumHelper(candidates, new ArrayList<>(), ans, 0, target);

        return ans;
    }

    public HashSet<List<Integer>> combinationSum2(int[] candidates, int target) {
        HashSet<List<Integer>> ans = new HashSet<List<Integer>>();
        combinationSumHelper2(candidates, new ArrayList<>(), ans, 0, target);
        // Convert HashSet<List<Integer>> to List<List<Integer>>
        // If you want to return List<List<Integer>> instead of HashSet
        // List<List<Integer>> result = new ArrayList<>(ans);
        combinationSumHelper2(candidates, new ArrayList<>(), ans, 0, target);
        // return result;
        return ans;
    }

    public void main(String[] str) {
        int[] candidates = new int[] { 10, 1, 2, 7, 6, 1, 5 };
        int target = 8;
        Arrays.sort(candidates);
        HashSet<List<Integer>> ans = combinationSum2(candidates, target);
        
        for (List<Integer> combination : ans) {
            System.out.println();
            for (int ele : combination) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
