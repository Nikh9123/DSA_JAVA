package arrays.easy;

import java.util.Arrays;

public class IntersectionArray {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0, k = 0;
        int[] ans = new int[Math.min(nums1.length, nums2.length)];

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                // Avoid duplicates in the result
                if (k == 0 || ans[k - 1] != nums1[i]) {
                    ans[k++] = nums1[i];
                }
                i++;
                j++;
            }

        }

        // Return only the filled part of the array
        return Arrays.copyOf(ans, k);
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 2, 1 };
        int nums2[] = { 2, 2 };
        int[] ans = intersection(nums1, nums2);

        for (int ele = 0; ele < ans.length; ele++) {
            System.out.print(ans[ele] + " ");
        }
    }
}