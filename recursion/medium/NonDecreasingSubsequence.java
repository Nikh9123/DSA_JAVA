package recursion.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class NonDecreasingSubsequence {
    static void generateSubsequence(List<List<Integer>> ans, List<Integer> list, int[] nums, int i) {
        if (list.size() > 1) {
            ans.add(new ArrayList<>(list));
        }

        List<Integer>used = new ArrayList<>();

        for (int j = i; j < nums.length; j++) {
            if (used.contains(nums[j])) continue; // avoid duplicates at this level
            if (list.isEmpty() || nums[j] >= list.get(list.size() - 1)) {
                used.add(nums[j]);
                list.add(nums[j]);
                generateSubsequence(ans, list, nums, j + 1);
                list.remove(list.size() - 1);
            }
        }
    }

    public static List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        generateSubsequence(ans, new ArrayList<>(), nums, 0);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 4,6,6 };

        for (List<Integer> list : findSubsequences(arr)) {
            System.out.print("[ ");
            for (int ele : list) {
                System.out.print(ele + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}