import java.util.*;
import java.lang.*;
import java.io.*;

public class StringTitle 
{

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline after the integer input

        while (t-- > 0) {
            String input = scanner.nextLine().trim(); // Read the entire line and trim any leading/trailing spaces

            // Handle empty or blank input
            if (input.isEmpty()) {
                continue;
            }

            StringBuilder str = new StringBuilder(input);

            // Capitalize the first letter
            str.setCharAt(0, Character.toUpperCase(str.charAt(0)));
            boolean isWord = true ;
            for(int i = 1 ;  i < str.length() ; i++){
                if(str.charAt(i-1) == ' ' && isWord){

                    StringBuilder word = new StringBuilder();
                    word.append(str.charAt(i));
                }
            }
            
            System.out.println(str); // Print the result
        }

        scanner.close();
    }
}


