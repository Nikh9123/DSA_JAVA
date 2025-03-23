package arrays.medium;

import java.util.*;

public class LeaderInArray {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> leaderInArray = new ArrayList<>();
        int n = arr.length;
        leaderInArray.add(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            System.out.println("i = " + i);
            if (arr[i] >= arr[i + 1] && arr[i] >= leaderInArray.get(leaderInArray.size()-1)) {
                leaderInArray.add(arr[i]);
            }
        }
        System.out.println(9999%10);
        Collections.reverse(leaderInArray);
        return leaderInArray;
    }

    public static void main(String[] args) {
        int nums[] = { 61,61,17 };
        ArrayList<Integer> leaderInArray = leaders(nums);

        for (int ele : leaderInArray) {
            System.out.print(ele + " ");
        }

    }
}
