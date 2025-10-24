package blind75;

public class RotateMatrix {
    private static void swap(int i, int j, int[][] matrix){
        int temp = matrix[i][j] ;

        matrix[i][j] = matrix[j][i] ;
        matrix[j][i] = temp ;
    }

    private static void reverseRows(int arr[], int start, int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end] ;
            arr[end] = temp ;
            start++;
            end-- ;
        }
    }
    
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        //find trnaspose of a matrix
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                swap(i, j, matrix);
            }
        }

        //reverse the rows
        for(int i = 0 ; i < n ; i++){
            reverseRows(matrix[i], 0, matrix[i].length-1);
        }

        // print
        for (int i = 0; i < n; i++) {
            System.out.println("{");
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("}");
        }

    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 5, 1, 9, 11 },
                { 2, 4, 8, 10 },
                { 13, 3, 6, 7 },
                { 15, 14, 12, 16 }
        };

        rotate(matrix);
        // Output: [
        // [15,13,2,5],
        // [14,3,4,1],
        // [12,6,8,9],
        // [16,7,10,11]]

    }
}
