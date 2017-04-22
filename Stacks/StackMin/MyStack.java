
import java.util.Stack;

/*
 * Design a stack which, in addition to push and pop has a
 * function min which returns the minimum element?
 * Push pop min should all operate in O(1) time.
 */

public class MyStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> auxStack;
    
    public MyStack() {
        mainStack = new Stack<Integer>();
        auxStack = new Stack<Integer>();
    }
    
    // O(1) operations but not optimized for space
    public void push(int value) {
        // Add element to main stack
        mainStack.push(value);
        // Maintain min element in an auxillary stack
        if(auxStack.isEmpty())
            auxStack.push(value);
        else
            auxStack.push(Math.min(auxStack.peek(), value));
    }
    
    public int pop() {
        auxStack.pop();
        return mainStack.pop();
    }
    
    public int getMin() {
        return auxStack.peek();
    }
}
