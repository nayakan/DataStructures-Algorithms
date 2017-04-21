/*
 * Given an integer, write a function to determine if it is a power of three.
 * Follow up:
 * Could you do it without using any loop / recursion?
 */

public class PowerOfThree {
    // Iterative solution
    public boolean isPowerOfThree(int n) {
        if(n == 0)
            return false;
        while(n % 3 == 0) {
            n /= 3;
        }
        return (n == 1);
    }
    
    // No loop or recursion
    public boolean isPowerOfThree1(int n) {
        return n == 0? false: n == Math.pow(3, Math.round(Math.log(n)/Math.log(3)));
    }
}
