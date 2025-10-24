package blind75;

public class GetSum {
    private static String convertToBinary(int num){
        StringBuilder binaryNumber = new StringBuilder();
        while (num > 0) {
            int lsb = num & 1 ;
            binaryNumber.insert(0, lsb);
            num = num >> 1 ;
        }
        
        return binaryNumber.toString() ;
    }

    private static int convertToDecimal(String binaryNumber){
    int ans = 0;
    int n = binaryNumber.length();
    for(int i = n - 1; i >= 0; i--){
        int bit = binaryNumber.charAt(i) - '0';  // Convert char to int
        ans += bit * (int)Math.pow(2, n - i - 1);
    }
    return ans;
}


    private static int sum(String a, String b) {
    int rightA = a.length() - 1;
    int rightB = b.length() - 1;
    int carry = 0;
    StringBuilder ans = new StringBuilder();

    while (rightA >= 0 || rightB >= 0 || carry != 0) {
        int bitA = (rightA >= 0) ? a.charAt(rightA) - '0' : 0;
        int bitB = (rightB >= 0) ? b.charAt(rightB) - '0' : 0;

        // XOR for addition without carry
        int sum = bitA ^ bitB ^ carry;

        // Calculate new carry
        carry = (bitA & bitB) | (bitA & carry) | (bitB & carry);

        ans.append(sum);

        rightA--;
        rightB--;
    }

    // Reverse to get correct binary order
    ans.reverse();
    return convertToDecimal(ans.toString());
}

    public static int getSum(int a, int b) {
        int num1 = Math.abs(a);
        int num2 = Math.abs(b);
        String numA = convertToBinary(num1);
        String numB = convertToBinary(num2);
        System.out.println("num a : " + numA + " num b : " + numB);
        return sum(numA, numB);
    }
    public static void main(String[] args) {
        int a = 5 ;
        int b = 6 ;

        System.out.println(getSum(a, b));
    }
}
/*
 * 0, 1, 2,  3,  4,   5,   6  , 7
 * 0, 1, 10, 11, 100, 101, 110, 111
 * 
 */