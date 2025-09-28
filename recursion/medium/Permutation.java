package recursion.medium;

import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        Permutation sol = new Permutation();
        List < List < Integer >> ls = sol.permute(nums);
        System.out.println("All Permutations are");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    private void recurPermute(int index, int[] nums, List < List < Integer >> ans) { //optimmal approach
        if (index == nums.length) {
            // copy the ds to ans
            List < Integer > ds = new ArrayList < > ();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList < > (ds));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            recurPermute(index + 1, nums, ans);
            swap(i, index, nums);
        }
    }
    private void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public void permuteHelper(int[] nums, List<List<Integer>>ans, List<Integer>list, boolean freq[]) { //using extra space --> brute force
        if(list.size() == nums.length){
            ans.add(new ArrayList<>(list)) ;
            return ;
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(freq[i] == false){
                freq[i] = true ;
                list.add(nums[i]) ;
                permuteHelper(nums, ans, list, freq);
                freq[i] = false ;
                list.remove(list.size()-1) ;
            }
        }
    }

    public List < List < Integer >> permute(int[] nums) {
        List < List < Integer >> ans = new ArrayList <> ();
        List<Integer>list = new ArrayList<>() ;
        boolean freq[] = new boolean[nums.length] ;
        permuteHelper(nums, ans, list, freq);
        recurPermute(0, nums, ans);
        return ans;
    }
}