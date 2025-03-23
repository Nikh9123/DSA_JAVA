import java.util.HashMap;

public class LongestSubarray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int arr[] = { 10, 5, 2, 7, 1, -10 };
        int k = 15;
        System.out.println(s.longestSubarray(arr, k));
        System.out.println(s.longestSubarray(arr, k, arr.length));

    }
}

class Solution {
    //optimal approach 1 using hashing 
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> hashMap = new HashMap<>() ;

        int prefixSum = 0 ;
        int longestSubarray = 0 ;
        int rem = 0 ;

        for(int i = 0 ; i < arr.length ; i++){
            prefixSum += arr[i] ;
            if(prefixSum == k){
                longestSubarray = Math.max(longestSubarray, i+1);
            }

            rem = prefixSum - k ;
            
            //check whether the rem is present in the previous sum or not
            if(hashMap.containsKey(rem)){

                longestSubarray = Math.max(longestSubarray, i - hashMap.get(rem));
            }

            if(!hashMap.containsKey(prefixSum)){
                hashMap.put(prefixSum, i);
            }
        }
        return longestSubarray ;
    }


    //only works with arr contains positive numbers 
    public int longestSubarray(int[] arr, int k, int n) {
        // code here
        int left = 0 , right =  0;
        int maxSubArrayLen =  0, sum = 0 ;

        while (right < n) {
            
            sum += arr[right] ;

            if(sum == k){
                maxSubArrayLen = Math.max(right - left + 1, maxSubArrayLen) ;
            }
            System.out.println("sum = " + sum);
            System.out.println("max length : " + maxSubArrayLen);
            if(sum > k){
                sum -= arr[left] ;
                left++ ;
                 if(sum == k){
                    maxSubArrayLen = Math.max(right - left + 1, maxSubArrayLen) ; 
                 }
            }
            right++ ;
        }
        return maxSubArrayLen ;
    }
}