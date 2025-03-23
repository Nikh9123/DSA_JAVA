public class Introduction {
    static int countNodes(int i) {
        // code here
        int n = i - 1;
        int ans = 2;
        if (n > 0) {

            for (int j = 1; j < n; j++) {
                ans *= 2;
            }
            return ans;
        } else if (n < 0) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Introduction intro = new Introduction();

        System.out.println(intro.countNodes(0));
    }
}
