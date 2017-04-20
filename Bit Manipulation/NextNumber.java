/*
 * Given a positive integer, write a method to print the next smallest and 
 * the next largest number that have the same number of 1 bits in their 
 * binary representation.
 */
 
public class NextNumber {
    public static int getNext(int num) {
        int c = num;
        int c0 = 0;
        int c1 = 0;
        
        while(((c & 1) == 0) && c != 0) {
            c0++;
            c >>= 1;
        }
        
        while((c & 1) == 1) {
            c1++;
            c >>= 1;
        }
        
        if(c0 + c1 == 31 || c0 + c1 == 0) {
            return -1;
        }
        
        // Position of rightmost non-trailing zeros
        int p = c0 + c1;
        //Flip rightmost trailing zero
        num |= (1 << p);
        // Clear all bits to the right of p
        num &= ~((1 << p) - 1);
        // Add c1 - 1 no of 1 bits to the right of p
        num |= (1 << (c1 - 1)) - 1;
        return num;
    }
    
    public static int getPrev(int num) {
        int c = num;
        int c0 = 0;
        int c1 = 0;
        
        while((c & 1) == 1) {
            c1++;
            c >>= 1;
        }
        
        if(c == 0)
            return -1;
        
        while(((c & 1) == 0) && (c != 0)) {
            c0++;
            c >>= 1;
        }
        // Position of rightmost non-trailing one
        int p = c0 + c1;
        //Clear bits from p onwards
        num &= ((~0) << (p + 1));
        num |= ((1 << (c1 + 1)) - 1) << (c0 - 1);
        return num;
    }
}
