package blind75;

import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[k];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Integer value : map.values()) {
            list.add(value);
        }

        Collections.sort(list);

        for (int i = 0; i < k; i++) {
            ans[i] = list.get(list.size() - i - 1);
        }
        return ans;
    }
}

public class TopKFrequentElement {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[k];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeapPq = new PriorityQueue<>(
                (a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            minHeapPq.add(entry);

            if (minHeapPq.size() > k) {
                minHeapPq.poll();
            }
        }

        for (int i = k - 1; i >= 0; i--) {
            ans[i] = minHeapPq.poll().getKey();
        }
        return ans;
    }

    public void main(String[] args) {

        int[] nums = new int[] { 1, 1, 1, 2, 2, 3 };
        int k = 2;

        int ans[] = topKFrequent(nums, k);

        for (int ele : ans) {
            System.out.print(ele + ' ');
        }
    }
}
