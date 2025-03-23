public class SelectionSort {
    public static void main(String[] args) {
        Solution s = new Solution();

        int arr[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        s.selectionSort(arr);

        System.out.println(arr.getClass());
        for(int ele :arr){
            System.out.print(ele + " ");
        }
    }
}

class Solution {
    void swap(int[] arr, int j, int i) {
        int val1 = arr[j];
        arr[j] = arr[i];
        arr[i] = val1;
    }

    void selectionSort(int[] arr) {
        // code here
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i ;
            int j = i + 1 ;
            for(; j < arr.length ; j++){
                if(arr[j] < arr[min]){
                    min = j ;
                }
            }
            swap(arr, min, i);
        }
    }
}