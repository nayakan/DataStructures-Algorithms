/*
 * Write a function to determine the number of bits you would
 * need to flip to convert interger A to integer B
 * Example 
 * Input: 29 (11101) to 15(01111)
 * Output: 2
 */

public class Conversion {
    public int bitSwap(int a, int b) {
        int count = 0;
        for(int c = a ^ b; c != 0; c >>= 1) {
            count += c & 1;
        }
        return count;
    }
}
