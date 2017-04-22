
import java.util.LinkedList;
import java.util.Queue;

/*
 * Implement stack using two queues.
 */

public class StackUsingQueue {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    
    /** Initialize your data structure here. */
    public StackUsingQueue() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue1.offer(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(queue1.isEmpty())
            return 0;
        while(queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }
        
        int res = queue1.poll();
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        
        return res;
    }
    
    /** Get the top element. */
    public int top() {
       while(queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }
        int res = queue1.poll();
        queue2.offer(res);
        
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return res; 
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}


