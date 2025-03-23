package arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
 * 
 */

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> tripletList = new ArrayList();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum > 0) {
                    k--;
                }
                if (sum < 0) {
                    j++;
                }

                if (sum == 0) {
                    while (nums[j] == nums[j + 1] && j < k) {
                        j++;
                    }
                    while (nums[k] == nums[k - 1] && k > j) {
                        k--;
                    }
                    tripletList.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
            }
        }
        return tripletList;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 0, 1, 2, -2, 0, -1, 0, 1, 3, -3, 4 };

        List<List<Integer>> tripletList = threeSum(nums);

        for (List<Integer> list : tripletList) {
            System.out.print("[");
            for (int ele : list) {
                System.out.print(ele + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
