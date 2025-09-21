package recursion.easy;

public class BasicPractice {

    void printNamesNTime(int n) {
        if (n == 0) {
            return;
        }

        System.out.println("Nikhil");
        printNamesNTime(n - 1);
        System.out.println("Ashirwad");
    }

    void print1toN(int n) {
        if (n < 1) {
            return;
        }

        System.out.println(n);
        print1toN(n - 1);
        System.out.println("after return : ");
    }

    int sum(int n, int ans) {
        if (n == 0)
            return ans;

        return sum(n - 1, ans + n);

    }

    int functionSum(int n) {
        if (n == 0)
            return 0;

        return n + functionSum(n - 1);
    }

    int functionalFactorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * functionalFactorial(n - 1);
    }

    int functionalFibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return functionalFibonacci(n - 1) + functionalFibonacci(n - 2);
    }

    public void main(String[] args) {
        // printNamesNTime(5);
        // print1toN(4);

        int ans = sum(9, 0);
        int sum = functionSum(10);
        System.out.println(ans + " " + sum + "\nfactorial : " + functionalFactorial(4) + "\nFibonacci : "
                + functionalFibonacci(5));
    }
}
