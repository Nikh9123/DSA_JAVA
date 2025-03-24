package arrays.medium;

import java.util.Arrays;

public class LongestSequence {
    static class Solution {
        public int longestConsecutive(int[] nums) {
            Arrays.sort(nums);
            int count = 0, maxCount = 0;
            int lastSmaller = Integer.MIN_VALUE;

            Arrays.sort(nums);

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == lastSmaller + 1) {
                    lastSmaller = nums[i];
                    count++;
                } else if (nums[i] != lastSmaller) {
                    count = 1;
                    lastSmaller = nums[i];
                }

                maxCount = Math.max(count, maxCount);
            }

            return maxCount;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int nums[] = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };

        System.out.println(solution.longestConsecutive(nums));
    }
}
