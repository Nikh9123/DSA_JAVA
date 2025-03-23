import java.util.Scanner;

public class ChefWord {

    public static void main(String[] args) throws java.lang.Exception {
        // take two string as input and check if the string is chefword or not
        Scanner sc = new Scanner(System.in);
        StringBuilder ans ;
        int t = sc.nextInt();

        while (t-- > 0) {
            String actualWord = sc.next();
            String guessWord = sc.next();
            ans = new StringBuilder();
            for (int i = 0; i < actualWord.length(); i++) {
                if (actualWord.charAt(i) == guessWord.charAt(i)) {
                    ans.append("G");
                } else {
                    ans.append("B");
                }
            }
            System.out.println(ans);
        }
    }

}
