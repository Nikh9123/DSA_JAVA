package blind75;

public class PalindromicSubstring {
    boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(end) == s.charAt(start)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    private int countSubstring(String str, int left, int right) {
        int count = 0;
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }

    public int countSubstrings(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans += countSubstring(s, i, i); // odd
            ans += countSubstring(s, i, i + 1); // even
        }
        return ans;
    }

    private String longestPalindrome(String s, int left, int right){

        while (left >= 0 && right < s.length() && s.charAt(right) == s.charAt(left)) {
            left-- ;
            right++ ;
        }
        
        return s.substring(left+1, right) ;
    }

    public String longestPalindrome(String s) {

        if(s == null || s.length() < 1){
            return "" ;
        }
        String evenString ;
        String oddString ;
        String longestSubstring ="" ;

        for(int i = 0 ; i < s.length() ; i++){
            evenString = longestPalindrome(s, i, i);
            oddString = longestPalindrome(s, i, i+1);

            String currentString = evenString.length() > oddString.length() ? evenString : oddString ;

            longestSubstring = longestSubstring.length() > currentString.length() ? longestSubstring : currentString ;
        }
        return longestSubstring ;
    }

    public void main(String[] args) {
        String str = "aaa"; // Example with overlapping palindromes: "a", "a", "a", "aa", "aa", "aaa" -> 6

        System.out.println(countSubstrings(str));

        String s = "abab" ;
        System.out.println(longestPalindrome(s));

    }
}