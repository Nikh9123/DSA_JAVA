package blind75;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {
        if (s.isEmpty()) {
            return true;
        }
        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);// in this way we can get from first till i character

            if ((wordDict.contains(prefix)) && wordBreak(s.substring(i), wordDict)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>(List.of("leet", "code"));
        System.out.println(wordBreak(s, wordDict));
    }
}
