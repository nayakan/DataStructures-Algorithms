
import java.util.Stack;

/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */

public class ValidParanthesis {
    
    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '(')
                stack.push(')');
            else if(c == '{')
                stack.push('}');
            else if(c == '[')
                stack.push(']');
            else if(stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
    
    public boolean isValid1(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stack.push(s.charAt(i));
            else if(s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(')
                stack.pop();
            else if(s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[')
                stack.pop();
            else if(s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{')
                stack.pop();
            else
                return false;
        }
        return stack.isEmpty();
    }
}
