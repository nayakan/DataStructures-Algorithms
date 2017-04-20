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

public class Insertion {
    public int updateBits(int n, int m, int i, int j) {
        if(j < i || i > 32)
            return 0;
        int mask = ~0 << (j + 1) | (~0 << i - 1);
        int n_cleared = n & mask;
        int m_shifted = m << i;
        return n_cleared | m_shifted;
    }
}
