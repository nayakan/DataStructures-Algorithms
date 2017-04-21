/*
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 */
 
 public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        return num == 0? false: num == Math.pow(4, Math.round(Math.log(num) / Math.log(4)));
    }
}
