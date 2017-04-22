import java.util.Stack;
/*
 * Implement myQueue class which implements a queue using two stacks.
 */


public class MyQueue {
    Stack<Integer> stackOldest;
    Stack<Integer> stackNewest;
    /** Initialize your data structure here. */
    public MyQueue() {
        stackOldest = new Stack<>();
        stackNewest = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stackNewest.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        shiftStacks();
        return stackOldest.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        shiftStacks();
        return stackOldest.peek();
    }
    
    private void shiftStacks() {
        if(stackOldest.isEmpty()) {
            while(!stackNewest.isEmpty()) {
                stackOldest.push(stackNewest.pop());
            }
        }
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackOldest.isEmpty() && stackNewest.isEmpty();
    } 
}
