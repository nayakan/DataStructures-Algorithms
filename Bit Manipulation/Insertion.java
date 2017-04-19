 /* 
 * You are given two 32-bit numbers, N and M, and two bit positions, i and j. Write a method to set all bits 
 * between i and j in N equal to M 
 * 
 * EXAMPLE:
 * Input: N = 10000000000, M = 10101, i = 2, j = 6
 * Output: N = 10001010100
 * 
 * Solution:
 * 1. clear the bits j through i in N
 * 2. shift M so that it lines up with bits j through i
 * 3. merge M and N
 *
 */

public class InsertionSolution {
    public static String toFullBinaryString(int num) {
        String s = "";
        for (int i = 0; i < 32; i++) {
            Integer lsb = new Integer(num & 1);
            s = lsb.toString() + s;
            num = num >> 1;
        }
        return s;
    }
    
    // Method to insert m into n from bit positions i to j
    public static int updateBits(int n, int m, int i, int j) {
        if(j < i || i > 32)
            return 0;
        int mask = ~0 << (j + 1) | (~0 << i - 1);
        int n_cleared = n & mask;
        int m_shifted = m << i;
        return n_cleared | m_shifted;
    }
    
    public static void main(String[] args) {
        // Test for sample inputs m = 11 & n = 1024
        int n = 1024;
        System.out.println(toFullBinaryString(n));
        int m = 11;
        System.out.println(toFullBinaryString(m));
        // result after inserting m into N from bit positions 2 to 6
        int result = updateBits(n, m , 2, 6);
        System.out.println(toFullBinaryString(result));
    }
}