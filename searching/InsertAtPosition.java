package searching;

public class InsertAtPosition {

    public int searchInsert(int[] nums, int ele) {
        // pointing to the last and first index of an array
        int low = 0;
        int high = nums.length - 1;
        int mid = 0 ;
        while (low <= high) {
            mid = (low + high) / 2;
            System.out.println("mid = " + mid);
            if (nums[mid] > ele) {
                high = mid - 1;
            } else if (nums[mid] < ele) {
                low = mid + 1;
            }
            else{
                return mid ;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        InsertAtPosition obj = new InsertAtPosition();
        int[] nums = {1, 3, 5, 6};
        int ele = 5;
        int position = obj.searchInsert(nums, ele);
        System.out.println("Element should be inserted at position: " + position);
    }
}
