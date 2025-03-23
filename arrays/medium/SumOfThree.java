package arrays.medium;

public class SumOfThree {
    public static boolean checkPowersOfThree(int n) {

        int value = n;

        while (value != 0) {
             if (value % 3 == 2) {
                return false;
            }
            value = value / 3;
        }
        return true ;
    }

    public static void main(String[] args) {
        int n = 90;
        System.out.println(checkPowersOfThree(n));
    }
}
