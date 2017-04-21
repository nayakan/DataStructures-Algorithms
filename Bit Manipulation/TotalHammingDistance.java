/*
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * Write a method to find the total Hamming distance between all pairs of the given numbers.
 * Input: 4, 14, 2
 * Output: 6
 * Explanation: In binary representation, the 4 is 0100, 14 is 1110, and 2 is 0010 (just
 * showing the four bits relevant in this case). So the answer will be:
 * HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2 + 2 + 2 = 6.
 */
 
 public class TotalHammingDistance {
    public int totalHammingDistance1(int[] nums) {
        int result = 0;
        for(int i = 0; i < 32; i++) {
            int bitCount = 0;
            for(int j = 0; j < nums.length; j++) {
                bitCount += (nums[j] >> i) & 1;
            }
            result += bitCount * (nums.length - bitCount);
        }
        return result;
    }
 }
 
