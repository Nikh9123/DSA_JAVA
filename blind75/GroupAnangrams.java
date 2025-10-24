package blind75 ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnangrams {
 
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();
 
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
 
            // If the key is not present, create a new list for it.
            // Then, add the original string 's' to the list.
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        // The values of the map are the lists of anagrams.
        return new ArrayList<>(map.values());
    }
 
    public void main(String[] args) {
        String arr[] = {"eat","tea","tan","ate","nat","bat"} ;
        
        List<List<String>> ans = groupAnagrams(arr);
 
        for (List<String> list : ans) {
            System.out.print("[");
            for (String str : list) {
                System.out.print(str + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
