package arrays.easy ;

public class CheckSortedArray {
    public boolean check(int[] nums) {
        int count = 0 ;

        for(int i = 0 ; i < nums.length - 1 ; i++){
            if(nums[i] > nums[i+1]){
                count++ ;
            }
        }

        return count <= 1 ;
    }

    public static void main(String[] args) {
        
    }
}
