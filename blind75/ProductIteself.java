package blind75;

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
// Example 2:

// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]
public class ProductIteself {

    // int ProductExceptself(int[]nums, int i, int j, int product){
    // if(i > j){
    // return product ;
    // }

    // product = product*nums[i] ;

    // return ProductExceptself(nums, i+1, j, product);
    // }

    // public int[] productExceptSelf(int[] nums) {
    // int ans[] = new int[nums.length];
    // for(int i = 0 ; i < nums.length-1 ; i++){
    // ans[i] = ProductExceptself(nums, i+1, nums.length-1, 1);
    // }

    // return ans ;
    // }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = 1 ;

        //find left multiply
        for(int i = 1 ; i < n ; i++){
            ans[i] = ans[i-1] * nums[i-1] ;
        }

        //find right multiply
        int suffix = 1 ;
        for(int i = n-1 ; i >= 0 ; i--){
            ans[i] = suffix * ans[i] ;
            suffix = suffix * nums[i] ;
        }

        return ans;
    }

    public void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };

        for (int ele : productExceptSelf(arr)) {
            System.out.print(ele + " ");
        }
    }
}
