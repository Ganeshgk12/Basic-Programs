import java.util.*;

public class ParanthesisValidation
{
	public static void main(String[] args) {
        String str = "]()[";
        
        System.out.println(isValid(str));
	}

    public static boolean isValid(String s) {
        if(s.length()%2 != 0){
            return false;
        }
        char[] stack = new char[s.length()];
        int st = 0;
        
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            
            if(x=='('||x=='{'||x=='['){
                stack[st++] = x;
            }
            else if(st != 0){ // chech if it is not empty
                if(x == ')' && stack[st - 1] == '(' || x == ']' && stack[st - 1] == '[' || x == '}' && stack[st - 1] == '{'){
                    stack[st - 1] = '0';
                    st--;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        
        return st == 0;
        
    }
}

