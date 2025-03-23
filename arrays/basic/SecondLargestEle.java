public class SecondLargestEle {
    public static void main(String[] args) {
        int[] arr = new int[] { 10,5,10};
        System.out.println(Solution.getSecondLargest(arr));
    }
}

class Solution {
    public static int getSecondLargest(int[] arr) {
        // Code Here
        int maxEle = Integer.MIN_VALUE;
        int secondMaxEle = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxEle) {
                secondMaxEle = maxEle;
                maxEle = arr[i];
                
            } else if (arr[i] > secondMaxEle && arr[i] != maxEle) {
                secondMaxEle = arr[i];
            }
        }
        return secondMaxEle;
    }
}