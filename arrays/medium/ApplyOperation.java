package arrays.medium;

/*
 * Example 1:

Input: nums = [1,2,2,1,1,0]
Output: [1,4,2,0,0,0]
Explanation: We do the following operations:
- i = 0: nums[0] and nums[1] are not equal, so we skip this operation.
- i = 1: nums[1] and nums[2] are equal, we multiply nums[1] by 2 and change nums[2] to 0. The array becomes [1,4,0,1,1,0].
- i = 2: nums[2] and nums[3] are not equal, so we skip this operation.
- i = 3: nums[3] and nums[4] are equal, we multiply nums[3] by 2 and change nums[4] to 0. The array becomes [1,4,0,2,0,0].
- i = 4: nums[4] and nums[5] are equal, we multiply nums[4] by 2 and change nums[5] to 0. The array becomes [1,4,0,2,0,0].
After that, we shift the 0's to the end, which gives the array [1,4,2,0,0,0].
Example 2:

Input: nums = [0,1]
Output: [1,0]
Explanation: No operation can be applied, we just shift the 0 to the end.

arr[] = {1,2,2,1,3,3,4}
        {}
 */

public class ApplyOperation {
    public static void swap(int nums[], int i , int j){
        int ele = nums[i] ;
        nums[i] = nums[j] ;
        nums[j] = ele ;
    }
    public static void moveZeroes(int[] nums) {
        int nonZero = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, i, nonZero);
                nonZero++;
            }
        }
    }
    public static int[] applyOperations(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }

        moveZeroes(nums);
        return nums ;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 1, 1, 0 };

        int ans[] = applyOperations(nums);

        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}
