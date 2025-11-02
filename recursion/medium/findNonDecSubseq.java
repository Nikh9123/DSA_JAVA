package recursion.medium ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findNonDecSubseq {
    private void findSubsequence(Set<List<Integer>>ans, List<Integer>list, int[]nums, int idx) {
        // We add the list to the answer if its size is 2 or more.
        // A set is used to automatically handle duplicate subsequences.
        if (list.size() > 1) {
            ans.add(new ArrayList<>(list));
        }

        for (int i = idx; i < nums.length; i++) {
            if(i != 0 && nums[i] == nums[i-1]) continue ;
            if (list.isEmpty() || nums[i] >= list.get(list.size() - 1)) {
                // Add the current number and recurse
                list.add(nums[i]);
                findSubsequence(ans, list, nums, i + 1);
                // Backtrack: remove the number to explore other possibilities
                list.remove(list.size() - 1);
            }
        }
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        findSubsequence(ans, new ArrayList<>(), nums, 0);
        return new ArrayList<>(ans);
    }

    public static void main(String[] args) {
        findNonDecSubseq solution = new findNonDecSubseq();
        int[] nums = {4, 6, 7, 7};
        List<List<Integer>> subsequences = solution.findSubsequences(nums);
        System.out.println("Non-decreasing subsequences are: " + subsequences);
    }
}
