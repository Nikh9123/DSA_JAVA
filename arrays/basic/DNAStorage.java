import java.util.Scanner;

public class DNAStorage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            String ans = ""; // Initialize result string

            for (int i = 0; i < n; i += 2) {
                int j = i + 1; // Calculate j
                if (j < n) {
                    if (s.charAt(i) == '0' && s.charAt(j) == '0') {
                        ans += "A";
                    } else if (s.charAt(i) == '0' && s.charAt(j) == '1') {
                        ans += "T";
                    } else if (s.charAt(i) == '1' && s.charAt(j) == '0') {
                        ans += "C";
                    } else if (s.charAt(i) == '1' && s.charAt(j) == '1') {
                        ans += "G";
                    }
                }
            }

            System.out.println(ans); // Print the result for this test case
        }
        scanner.close();
    }
}
