/*
 * Given an integer, write a function to determine if it is a power of two.
 */

public class PowerOfTwo {

    // Iterative, log n complexity
    public boolean isPowerOfTwo(int n) {
        if(n == 0)
            return false;
        while(n % 2 == 0) {
            n /= 2;
        }
        return (n == 1);
    }
    
    //Using bitcount
    public boolean isPowerOfTwo1(int n) {
        return n>0 && Integer.bitCount(n) == 1;
    }
    
    public boolean isPowerOfTwo2(int n) {
        if(n == 0)
            return false;
        int ones = 0;
        for (int i = 1; i <= 32; ++i) {         
            ones += n & 1;
            n = n >> 1;
        }
        return ones == 1;
    }
}
