import java.util.*;
import java.lang.*;
import java.io.*;

public class ConsecutiveChar {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt() ;

        while(t-- > 0){
            int n = scanner.nextInt() ;
            String str = scanner.next();
            int ans = 0;
            for(int i = 0 ; i < n-1 ; i++){
                int j = i+1 ;

                if(str.charAt(i) == str.charAt(j)){
                    ans++ ;
                }
            }
            System.out.println(ans);
        }
	}
}
