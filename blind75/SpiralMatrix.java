package blind75;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int rows = matrix.length, columns = matrix[0].length;
        int left = 0, right = columns - 1, top = 0, bottom = rows - 1;

        while (left <= right && top <= bottom) {
            System.out.println("top : " + top + " bottom : " + bottom + " left : " + left + " right : " + right);
            for (int i = left; i <= right; i++) { //top row traversal
                ans.add(matrix[top][i]);
            }
            top++;
            System.out.println("top : " + top + " bottom : " + bottom + " left : " + left + " right : " + right);
            for (int i = top; i <= bottom; i++) { //right col traversal
                ans.add(matrix[i][right]);
            }
            right--;
            if (right > left) {
                System.out.println("top : " + top + " bottom : " + bottom + " left : " + left + " right : " + right + "right if");
                for (int i = right; i >= left; i--) {//last row traversal
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(bottom >= top){
                System.out.println("top : " + top + " bottom : " + bottom + " left : " + left + " right : " + right + "bottom");
            for (int i = bottom; i >= top; i--) { //first col traversal
                ans.add(matrix[i][left]);
            }
            left++;
        }
        System.out.println("top : " + top + " bottom : " + bottom + " left : " + left + " right : " + right);
        }
        return ans;
    }

    public void main(String[] args) {
        int matrix[][] = {
                {1},
                {5},
                {9} };

        for (Integer ele : spiralOrder(matrix)) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
