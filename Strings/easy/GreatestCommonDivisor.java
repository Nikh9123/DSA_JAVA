package Strings.easy;

public class GreatestCommonDivisor {

    public static String gcdOfStrings(String str1, String str2) {
        //it will make sure that if the character structures are the same?
        if(!((str1+str2).equals((str2+str1)))){
            return "" ;
        }

        int lenGcd = findGcd(str1.length(), str2.length());


        return str1.substring(0, lenGcd) ;

    }

    private static int findGcd(int len1, int len2){

        while(len2 != 0){
            int temp = len1 % len2 ;

            len1 = len2 ;

            len2 = temp ;
        }
        return len1 ;
    }

    public static void main(String[] args) {

        int ans = findGcd(9, 10) ;

        System.out.println("ans : " + gcdOfStrings("ababab", "abab"));
    }
}
