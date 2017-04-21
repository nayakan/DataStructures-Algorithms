/*
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has.
 */
 
 public class Solution {
    public int hammingWeight(int n) {
        int ones = 0;
        while(n != 0) {
            ones += (n & 1);
            n >>>= 1;
        }
        return ones;
    }
}
