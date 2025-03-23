
public class RemoveDuplicateElement {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = s.removeDuplicates(nums);
        System.out.println("The length of the array after removing duplicates is: " + newLength);
        System.out.print("The array after removing duplicates is: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
       int UnqCnt = 0 ;

       for(int i = 0 ; i < nums.length ; i++){
        //if element does not match then it is unique ;

        if(nums[i] != nums[UnqCnt]){
            UnqCnt++ ;
            nums[UnqCnt] = nums[i] ;
        }

       }
        return UnqCnt+1 ;

    }
    
}