import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static List<Integer> addRow(int row, List<List<Integer>> pascalList) {
        List<Integer> arrayListRow = new ArrayList<>();
        arrayListRow.add(1); // First element is always 1

        for (int i = 1; i < row - 1; i++) {
            int left = pascalList.get(row - 2).get(i - 1);
            int right = pascalList.get(row - 2).get(i);
            arrayListRow.add(left + right);
        }

        if (row > 1) {
            arrayListRow.add(1); // Last element is always 1 for rows greater than 1
        }

        return arrayListRow;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> pascalList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            List<Integer> val = addRow(i, pascalList);
            System.out.println(val.size());
            pascalList.add(val);
        }

        // Print Pascal's Triangle
        for (List<Integer> row : pascalList) {
            System.out.println(row);
        }
    }
}