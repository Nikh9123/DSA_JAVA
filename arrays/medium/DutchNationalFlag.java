package arrays.medium;


public class DutchNationalFlag {

    public void swap(int[]nums, int a , int b){
        int temp = nums[a];
        nums[a] = nums[b] ;
        nums[b] = temp ;
    }
    public void sortColors(int[] nums) {
        int low = 0 ;
        int mid = 0 ;
        int high = nums.length - 1 ;

        while(mid <= high){
            
            if(nums[mid] == 0){
                swap(nums, low, mid);
                mid++ ;
                low++ ;
            }
            else if(nums[mid] == 1){
                mid++ ;
            }
            else{
                swap(nums, mid , high);
                high-- ;
                mid++ ;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        DutchNationalFlag  dFlag = new DutchNationalFlag() ;
        
        System.out.println("Before processing : ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println("");

        dFlag.sortColors(arr);
        System.out.println("after processing : ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println("");
    }
}
