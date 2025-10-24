package recursion.easy;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length()-1 ;

        while (left < right) {
            if(s.charAt(right) == s.charAt(left)){
                left++ ;
                right-- ;
            }
            else{
                return false ;
            }
        }
        return true ;
    }

    boolean isPalindromeRecursion(int left, int right, String str){
        if(left >= right){
            return true ;
        }

        if(str.charAt(right) == str.charAt(left)){
            return isPalindromeRecursion(left +1, right-1, str);
        }
        return false ;
    }
    public void main(String[] args) {
        String s = "madam";

        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        // System.out.println();
        System.out.println(isPalindromeRecursion(0, str.length()-1, str));

    }
}
