package blind75;

public class FindMinimumInSortedRotatedArray {
    public static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        int ans = Integer.MAX_VALUE ;

        while (left <= right) {
            int mid = (left + right)/2 ;

            //if array is already sorted then return arr[left]
            if(nums[left] <= nums[mid] && nums[mid] <= nums[right]){
                ans = Math.min(ans, nums[left]);
            }

            //find sorted half
            if (nums[left] <= nums[mid]) {
                ans = Math.min(nums[left], ans);
                left = mid + 1 ;
            }
            else{
                ans = Math.min(ans, nums[mid]);
                right = mid - 1 ;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 2};
        // System.out.println((1/2));
        System.out.println(findMin(arr));
    }
}
