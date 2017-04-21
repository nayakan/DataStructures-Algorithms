/*
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * Given two integers x and y, write a method to calculate the Hamming distance.
 * 0 ≤ x, y < 231
 * Example
 * Input: x = 1, y = 4
 * Output: 2
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 * The above arrows point to positions where the corresponding bits are different.
 */

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int c = x ^ y;
        int count = 0;
        for(int i = 0; i < 32; i++) {
            if((c & 1) == 1)
                count++;
            c = c >> 1;
        }
        return count;
    }
}
