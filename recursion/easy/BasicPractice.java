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

    void reverseArray(int[] arr, int i, int j){
        if(i >= j){
            return ;
        }

        swap(i, j, arr);
        reverseArray(arr, i+1, j-1);
    }

    void swap(int i, int j, int[] arr){
        int temp = arr[j] ;
        arr[j] = arr[i] ;
        arr[i] = temp ;
    }

    void reverseArray(int[] arr){
        int i = 0 , j = arr.length-1 ;

        while (i <= j) {
            swap(i, j, arr);
            i++ ;
            j-- ;
        }

    }
    
    public void main(String[] args) {
        // printNamesNTime(5);
        // print1toN(4);

        int ans = sum(9, 0);
        int sum = functionSum(10);
        System.out.println(ans + " " + sum + "\nfactorial : " + functionalFactorial(4) + "\nFibonacci : "
                + functionalFibonacci(5));

        int arr[] = new int[]{1,2,3,4} ;
        reverseArray(arr, 0, arr.length-1);
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
