import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        Solution s = new Solution();
        int arr[] = { 1, 3, 4, 2, 9, 0, 11 }, target = 10;
        System.out.println(s.twoSum(arr, target)[0] + " " + s.twoSum(arr, 10)[1]);
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> storePrevEle = new HashMap<>();
        int ans[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int ele = nums[i];

            int rem = target - ele;

            if (storePrevEle.containsKey(rem)) {
                ans[0] = i;
                ans[1] = storePrevEle.get(rem);
            }

            storePrevEle.put(ele, i);
        }
        return ans;
    }
}