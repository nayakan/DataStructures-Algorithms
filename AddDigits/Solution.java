Add Digits

/*
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * Do it without any loop/recursion in O(1) runtime?
 */

 /**
 *
 * @author Akshatha
 */
public class Solution {
    // Using https://en.wikipedia.org/wiki/Digital_root
    public int addDigits(int num) {
        return num == 0? 0: (num % 9 == 0)? 9 : (num % 9);
    }
}
