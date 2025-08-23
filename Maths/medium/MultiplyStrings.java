package Maths.medium;

public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
        int n = num1.length() ;
        int m = num2.length() ;

        int answer[] = new int[m + n] ;

        for(int i = n-1 ; i >= 0 ; i--){
            for(int j = m-1 ; j >= 0 ; j--){
                
                int val1 = num1.charAt(i) - '0' ;
                int val2 = num2.charAt(j) - '0' ;

                int mul = val1 * val2 ;

                int p1 = i+j , p2 = i + j +1 ;

                int sum = mul + answer[p2] ;

                answer[p1] += sum / 10 ; //stores carry
                answer[p2] = sum % 10 ; //stores the multiplication value 

            }
            for (int ans : answer) {
                System.out.print(ans + " ");
            }
            System.out.println();
        }
        StringBuilder answBuilder = new StringBuilder() ;

        for (int ans : answer) {
            if(!(ans == 0 && answBuilder.length() == 0)){
                answBuilder.append(ans) ;
            }
        }
        return answBuilder.toString() ;
    }

    public static void main(String[] args) {
        System.out.println("hey : "+ multiply("2", "3"));
    }
}
