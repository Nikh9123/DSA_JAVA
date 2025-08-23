package Maths.easy;

public class PrimeNumber {
    public static boolean isPrimeNumber(int n){
        //* APPROACH 1 T.C O(n) 
        //* LOOP FROM 2 TO < N */

        /* 
        if(n == 1){
            return false ;
        }
        
        for(int i = 2 ; i < n ; i++){
            if(n % i == 0){
                return false ;
            }
        }

        */

        //use factorial wala mind 
        /*
         * eg : n = 30 
         * prime factors : (1,30)(3,10)(2,15)
         * one of the its factor always comes under sqrt(n) 
         */

        if(n == 1){
            return false ;
        }

        for(int i = 2 ; i < Math.sqrt(n) ; i++){
            
        }

        return true ;
    }
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(66));
    }
}
