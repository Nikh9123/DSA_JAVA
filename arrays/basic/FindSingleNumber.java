public class FindSingleNumber {
    public static void main(String[] args) {
        int arr[] = { 2 };
        Solution s = new Solution();

        System.out.println(s.singleNumber(arr));
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        int singleNumber = nums[0];

        for (int i = 1; i < nums.length; i++) {
            singleNumber = singleNumber ^ nums[i];
        }

        return singleNumber;
    }
}
