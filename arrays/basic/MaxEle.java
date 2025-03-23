public class MaxEle {
    public static void main(String[] args) {
        
        int[] arr = new int[] {93,45,67,3,45,9} ;

        System.out.println(Solution.largest(arr));
    }
}

class Solution {
    protected static int largest(int[] arr) {
        // code here
        int maxEle = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxEle) {
                maxEle = arr[i];
            }
        }
        return maxEle ;
    }
}