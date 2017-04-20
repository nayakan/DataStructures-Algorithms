/*
 * Write a method to swap odd and even bits in an 32 bit integer with as
 * few instructions as possible.
 */

public class PairwiseSwap {
    public static int swapOddEvenBits(int num) {
        // (num & 0xaaaaaaaa) gives all even bits of num
        // (num & 0x55555555) gives all odd bits of num
        return (((num & 0xaaaaaaaa) >>> 1) | ((num & 0x55555555) << 1));
    }
}
