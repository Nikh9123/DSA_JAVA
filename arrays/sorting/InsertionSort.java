public class InsertionSort {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr = { 10, 11, 4, 9, 8, 7, 6 };

        s.insertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {

                    int ele = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = ele;
                }
            }
        }
    }
}
