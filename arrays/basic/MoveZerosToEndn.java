public class MoveZerosToEndn {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 0, 0, 3, 0, 9, 4, 4, 94 };
        Solution s = new Solution();
        Utils.printArray(nums, "array before process");
        s.moveZeroes(nums);
        Utils.printArray(nums, "After process");
    }
}

class Solution {
    public void swap(int nums[], int i, int j) {
        int ele = nums[i];
        nums[i] = nums[j];
        nums[j] = ele;
    }

    public void moveZeroes(int[] nums) {
        int nonZero = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, i, nonZero);
                nonZero++;
            }
        }
    }

}