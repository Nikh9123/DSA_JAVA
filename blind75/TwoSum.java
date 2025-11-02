package blind75 ;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer>map = new HashMap<>() ;
        int[] ans = new int[2] ;
        for(int i = 0 ; i < nums.length ; i++){
            int findInMap = target - nums[i] ;
            if(map.containsKey(findInMap)){
                ans[0] = map.get(findInMap);
                ans[1] = i ;
            }
            map.put(nums[i], i);
        }
        return ans ;
    }
    public static void main(String[] args) {
        int nums[] = {2,7,9,11};
        int target = 9 ;

        for(int ele : twoSum(nums, target)){
            System.out.println(ele);
        }
    }
}