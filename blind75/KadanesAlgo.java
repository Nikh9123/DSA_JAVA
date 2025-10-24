package blind75;

public class KadanesAlgo {
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum < 0) {
                sum = 0;
            }

            maxSum = Math.max(maxSum, sum);
            System.out.println("maxSum : " + maxSum + " sum : " + sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        System.out.println(maxSubArray(arr));
    }
}
