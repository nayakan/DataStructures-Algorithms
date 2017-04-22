
import java.util.Stack;

/*
 * Design a stack which, in addition to push and pop has a
 * function min which returns the minimum element?
 * Push pop min should all operate in O(1) time and O(1) space.
 */

/**
 *
 * @author Akshatha
 */
public class MyStackII {
    Stack<Integer> stack;
    int minEle;
    
    public MyStackII() {
        stack = new Stack<>();
    }
    
    public void push(int x) {
        if(stack.isEmpty()) {
            minEle = x;
            stack.push(x);
            System.out.println("Number pushed to stack:" + x);
            return;
        }
        
        if(x < minEle) {
            stack.push(2 * x - minEle);
            minEle = x;
        } else {
            stack.push(x);
        }
        System.out.println("Number pushed to stack:" + x);
    }
    
    public void pop() {
        if(stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Top element popped:");
        int tmp = stack.pop();
        if (tmp < minEle) {
            System.out.println(minEle);
            minEle = 2*minEle - tmp;
        } else
            System.out.println(tmp);
    }
    
    public void peek() {
        if(stack.isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Topmost element is:");
        int tmp = stack.peek();
        if(tmp < minEle)
            tmp = minEle;
        System.out.println(tmp);
    }
    
    public void getMin() {
        if(stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else
            System.out.println("Min element in the stack is:" + minEle);
    }
}
