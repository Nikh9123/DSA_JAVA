package Maths.medium;

public class Divide {
    public static int divide(int dividend, int divisor) {

        if (dividend == divisor)
            return 1;

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        if (divisor == 1)
            return dividend;

        if (dividend == -1)
            return -dividend;

        int sign = 1;
        if (dividend > 0 && divisor < 0)
            sign = -1;
        if (dividend < 0 && divisor > 0)
            sign = -1;

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        int ans = 0;

        long addValue = d;

        while (n >= d) {
            d += addValue;
            ans++;
        }

        if (ans >= Math.pow(2, 31) && sign == 1)
            return Integer.MAX_VALUE;
        if (ans >= Math.pow(2, 31) && sign == -1)
            return Integer.MIN_VALUE;

        return ans * sign;
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648, -1));
    }

}
