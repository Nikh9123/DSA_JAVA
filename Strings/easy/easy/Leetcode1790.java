
public class Leetcode1790 {
    public static void main(String[] args) {
        String str1 = "bank";
        String str2 = "kanb";
        Leetcode1790 solution = new Leetcode1790();

        boolean value = solution.areAlmostEqual(str1, str2);
        System.out.println(value);
    }

    public boolean areAlmostEqual(String s1, String s2) {
        int countDifference = 0;

        //When the string can be made similar after one swap then thier must be only two character different from another string so 
        int j = -1 ; //will keep track of different element
        int k = -1 ;//will keep track of different element
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                countDifference++;
                if(j == -1) j = i ;
                else if(k == -1) k = i ;
            }
        }
        
        
        if(countDifference==0) return true;
        else if(countDifference == 2 && s1.charAt(j)==s2.charAt(k) && s1.charAt(k)==s2.charAt(j)){
            return true;
        }

        return false;
    }
}