package arrays.medium;

public class NextPermutation {
    class Solution {
        private static void swap(int num1, int num2, int[] arr) {
            int temp = arr[num1];
            arr[num1] = arr[num2];
            arr[num2] = temp;
        }
    
        private static void reverse(int[] nums, int start, int end) {
            for (; start < end; start++, end--) {
                swap(start, end, nums);
            }
        }
    
        public void nextPermutation(int[] nums) {
            int n = nums.length;
            int dipIndex = -1; 
    
            // Step 1: Find the first decreasing element from the right
            for (int i = n - 2; i >= 0; i--) {
                if (nums[i] < nums[i + 1]) { // Fix: Use < instead of >
                    dipIndex = i;
                    break;
                }
            }
    
            // Step 2: Find the element just greater than nums[dipIndex] from the right
            if (dipIndex != -1) {
                for (int i = n - 1; i > dipIndex; i--) { // Fix: No need to check i >= 0
                    if (nums[i] > nums[dipIndex]) {
                        swap(i, dipIndex, nums);
                        break;
                    }
                }
            }
    
            // Step 3: Reverse the decreasing sequence after dipIndex
            reverse(nums, dipIndex + 1, n - 1);
        }
    }
    
    public static void main(String[] args) {
        NextPermutation np = new NextPermutation();
        Solution sol = np.new Solution();
        
        int[] nums = {2,1,3,4,5,6,9};
        System.out.println("Original array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        sol.nextPermutation(nums);

        System.out.println("Next permutation: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}


