import java.util.*;

public class LetterCombinationOfaPhonenumberNew {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Press the number: ");
        String number = in.next();

        findCombination("", number);
    }
    
    static String[] buttonMappings = {
        "", "", "abc",  "def", "ghi", "jkl", "mno", "pqrs", "tuv","wxyz" };

    static void findCombination(String prefix, String remaining) {
        if (remaining.isEmpty()) {
            System.out.print(prefix + " ");
            return;
        }

        int digit = remaining.charAt(0) - '0';

       /* if (digit < 2 || digit > 9) {
            System.out.println("Invalid input. Please enter digits between 2 and 9.");
            return;
        }*/

        String letters = buttonMappings[digit];

        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            findCombination(prefix + ch, remaining.substring(1));
        }
    }
}
