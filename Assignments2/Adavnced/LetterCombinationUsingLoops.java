import java.util.*;

public class LetterCombinationUsingLoops {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Press the number: ");
        String number = in.next();

        String[] ans = findCombination(number);
        
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
    
    static String[] buttonMappings = {
        "", "", "abc",  "def", "ghi", "jkl", "mno", "pqrs", "tuv","wxyz" };

    static String[] findCombination(String remaining) {
        
        String[] result = {""};
        for(int i = 0; i < remaining.length(); i++){
            int digit = remaining.charAt(i) - '0';
            
            String[] temp = new String[result.length * buttonMappings[digit].length()];
            int index = 0;
            
            for(String ch : result){
                String letters = buttonMappings[digit];
                
                for(int j = 0; j < letters.length(); j++){
                    temp[index++] = ch + letters.charAt(j);
                }
            }
            result = temp;
        }
        
        return result;
    }
}
