package blind75;

public  class SetMatrixZero {

    public static void setZeroes(int[][] matrix) {
        
    }

     // Function to print a 2D matrix
    public static void printMatrix(int[][] matrix) {
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {          // loop through rows
            for (int j = 0; j < matrix[i].length; j++) {   // loop through columns
                System.out.print(matrix[i][j] + " ");       // print each element
            }
            System.out.println();  // new line after each row
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {0,1,2,0},{3,4,5,2},{1,3,1,5}
        };
        setZeroes(matrix);
        printMatrix(matrix);
    }
}
