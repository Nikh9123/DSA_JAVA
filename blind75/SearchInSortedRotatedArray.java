package blind75;

public class SearchInSortedRotatedArray {

    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (target == nums[mid]) {
                return mid ;
            }

            if(nums[low] <= nums[mid]){
                if(target >= nums[low] && nums[mid] > target){
                    high = mid - 1 ;
                }
                else{
                    low = mid + 1 ;
                }
            }
            else{
                if(target >= nums[mid] && nums[high] >= target) {
                  low = mid + 1 ;  
                }
                else{
                    high = mid - 1 ;
                }
            }
        }
        return -1 ;
    }

    public static void main(String[] args) {
        int nums[] = { 5, 1, 3 }, target = 3;

        System.out.println(search(nums, target));
    }
}
