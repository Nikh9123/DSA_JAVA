import java.util.Scanner;

public class MaxConsecutiveOne {
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Solution s = new Solution();
        int ans = s.findMaxConsecutiveOnes(arr);
        System.out.println(ans);
    }
}

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}
