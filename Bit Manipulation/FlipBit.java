/*
 * You have an integer and you can flip exactly one bit from a 0 to a 1.
 * Write code to find the length of the longest sequence of 1s you could 
 * create.
 */

public class FlipBit {
    public static int flipBit(int num) {
        if(~num == 0)
            return Integer.BYTES * 8;
        
        int currLen = 0;
        int prevLen = 0;
        int maxLen = 0;
        
        while( num != 0) {
            if((num & 1) == 1)
                currLen++;
            else if((num & 1) == 0) {
                // Update to 0 if next bit is 0 or currLen if next bit is 1
                prevLen = (num & 2) == 0? 0: currLen;
                currLen = 0;
            }
            maxLen = Math.max(prevLen + currLen + 1, maxLen);
            num >>>= 1;
        }
        return maxLen;
    }
    
    public static void main(String[] args) {
        int input = 1775;
        int maxLen = flipBit(1743);
        System.out.println(maxLen);
    }
}
