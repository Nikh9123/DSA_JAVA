package arrays.medium;

import java.util.Arrays;

public class LongestSequence {
    static class Solution {
        public int longestConsecutive(int[] nums) {
            // Sort the array to bring consecutive numbers next to each other
            Arrays.sort(nums);

            // Initialize variables to keep track of the current sequence count and the maximum sequence count
            int count = 0, maxCount = 0;

            // Variable to store the last number in the sequence
            int lastSmaller = Integer.MIN_VALUE;

            // Iterate through the sorted array
            for (int i = 0; i < nums.length; i++) {
                // If the current number is exactly 1 greater than the last number in the sequence
                if (nums[i] == lastSmaller + 1) {
                    lastSmaller = nums[i]; // Update the last number in the sequence
                    count++; // Increment the current sequence count
                } 
                // If the current number is not equal to the last number (to handle duplicates)
                else if (nums[i] != lastSmaller) {
                    count = 1; // Reset the current sequence count to 1
                    lastSmaller = nums[i]; // Update the last number in the sequence
                }

                // Update the maximum sequence count if the current sequence is longer
                maxCount = Math.max(count, maxCount);
            }

            // Return the length of the longest consecutive sequence
            return maxCount;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example input array
        int nums[] = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };

        // Print the length of the longest consecutive sequence
        System.out.println(solution.longestConsecutive(nums));
    }
}