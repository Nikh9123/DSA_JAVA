public class RotateArray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        Utils.printArray(arr, "Before rotation : ");
        int k = 54944 % arr.length ;
        System.out.println("k = " + k);
        s.rotate(arr,3);
        Utils.printArray(arr, "After rotation : ");
    }
}

class Solution {
    private void rotatByOne(int[] nums){
        int lastEle = nums[nums.length-1] ;

        for(int i = nums.length -1 ; i > 0 ; i--){
            nums[i] = nums[i-1] ;
        }

        nums[0] = lastEle ;
    }
    public void rotate(int[] nums, int k) {
        for(int i = 0 ; i < k ; i++){
            rotatByOne(nums);
        }
    }
}
