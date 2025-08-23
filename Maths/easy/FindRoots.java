package Maths.easy;

import java.util.ArrayList;
/*
 * Given a quadratic equation ax2 + bx + c = 0, find its roots. If the roots are imaginary, return only one integer -1. Always return the roots as the greatest integers less than or equal to the actual roots, with the maximum root first followed by the minimum root.

Note: If roots are imaginary, the generated output will display "Imaginary".

Examples:

Input:
a = 1, b = -2, c = 1
Output: 1 1
Explanation:
Roots of equation x2-2x+1 are 1 and 1.
Input:
a = 1, b = -7, c = 12
Output: 4 3
Explanation: Roots of equation x2 - 7x + 12 are 4 and 3.
 

Expected Time Complexity: O(1)
Expected Auxiliary Space : O(1)
 */

public class FindRoots {
    static private ArrayList<Integer> getRoots(int a, int b, int c) {

        // use formula
        // d = b^2 - 4ac
        ArrayList<Integer> ans = new ArrayList<>();
        double d = (Math.pow(b, 2) - (4 * a * c));
    //    System.out.println("d : " + d);
        if (d < 0) {
            ans.add(-1);
            return ans;
        }

        // find r1 and r2 or r = (-b +- sqrt(d))/2a

        double r1 = Math.floor((-b + Math.sqrt(d)) / (2 * a));

        double r2 = Math.floor((-b - Math.sqrt(d)) / (2 * a));

        if (r1 >= r2) {
            // convert r1 to integer
            ans.add((int) r1);
            ans.add((int) r2);
        } else {
            ans.add((int) r2);
            ans.add((int) r1);
        }
        return ans;

    }

    public static void main(String[] args) {
        ArrayList<Integer>ans = getRoots(752,904,164);

        // /* 1. Using traditional for loop */
        // for (int i = 0; i < ans.size(); i++) {
        //     System.out.print(ans.get(i) + " ");
        // }
        // System.out.println();

        // /* 2. Using enhanced for-each loop */
        // for (int root : ans) {
        //     System.out.print(root + " ");
        // }
        // System.out.println();

        // /* 3. Using Iterator */
        // java.util.Iterator<Integer> it = ans.iterator();
        // while (it.hasNext()) {
        //     System.out.print(it.next() + " ");
        // }
        // System.out.println();

        /* 4. Using forEach method with lambda */
        ans.forEach(root -> System.out.print(root + " "));
        System.out.println();

        // /* 5. Using streams */
        // ans.stream().forEach(root -> System.out.print(root + " "));
        // System.out.println();
    }
}
