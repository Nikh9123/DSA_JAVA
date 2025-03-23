package recursion.easy;

public class NFactorial {

    public static int nFactorial(int n, int ans){
        if(n == 0 || n == 1){
            return 1 ;
        }
        ans = n * nFactorial(n-1, ans) ;
        return ans ;
    }
    public static void main(String[] args) {
        System.out.println(nFactorial(5, 0));
    }
}
