
import java.util.Stack;

/*
 * Write a method to sort a stack such that the smallest items are on the top.
 * You can use an additional temporary stack, but you may not copy the elements 
 * into any other data structure(such as arrays). 
 * The stack supports: push, pop, peek, isEmpty.
 */

public class StackSort {
    public Stack<Integer> sortStack(Stack<Integer> s) {
        Stack<Integer> bufferStack = new Stack<>();
        
        while(!s.isEmpty()) {
            int temp = s.pop();
            if(!bufferStack.isEmpty() && bufferStack.peek() > temp) {
                s.push(bufferStack.pop());
            }
            bufferStack.push(temp);
        }
        return bufferStack;
    }
}
