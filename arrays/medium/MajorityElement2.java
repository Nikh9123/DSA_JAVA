package arrays.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement2 {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        HashMap<Integer, Integer> strVoteHashMap;

        // store in the element and thier count in map
        strVoteHashMap = new HashMap<>();
        for (int ele : nums) {
            strVoteHashMap.put(ele, strVoteHashMap.getOrDefault(ele, 0) + 1);
        }

        for (int key : strVoteHashMap.keySet()) {
            if (strVoteHashMap.get(key) > nums.length / 3) {
                ans.add(key);
            }

        }

        return ans;
    }

    // approach without hashmap
    public static List<Integer> majorityElement(int[] nums, int n) {
        List<Integer> ans = new ArrayList<>();

        int ele1 = Integer.MAX_VALUE, cnt1 = 0;
        int ele2 = Integer.MIN_VALUE, cnt2 = 0;
        int majorityElement = n / 3;
        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && nums[i] != ele2) {
                ele1 = nums[i];
                cnt1 = 1;
            }
            if (cnt2 == 0 && nums[i] != ele1) {
                ele2 = nums[i];
                cnt2 = 1;
            }
            if (nums[i] == ele1) {
                cnt1++;
            } else if (nums[i] == ele2) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == ele1) {
                cnt1++;
            } else if (nums[i] == ele2) {
                cnt2++;
            }
        }

        if (cnt1 > majorityElement) {
            ans.add(ele1);
        }
        if (cnt2 > majorityElement) {
            ans.add(ele2);
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3 };

        List<List<Integer>> ans = new ArrayList<>();
        // ans.add(majorityElement(nums));
        ans.add(majorityElement(nums, nums.length));

        ans.stream()
           .flatMap(List::stream)
           .forEach(System.out::println);
    }
}
