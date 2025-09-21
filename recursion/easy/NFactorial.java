package recursion.easy;

public class NFactorial {

    public static int nFactorial(int n, int ans){
        ans = 1 ;

        for(int i = 1 ; i <= n ; i++){
            ans = ans * i ;
        }
        return ans ;
    }

    public static int nFactorialRecursion(int n, int ans){
        if(n == 0){
            return 0 ;
        }

        ans = ans * nFactorial(n-1, ans) ;
        return ans ;
    }
    public static void main(String[] args) {
        System.out.println(nFactorial(5, 0));
    }
}
