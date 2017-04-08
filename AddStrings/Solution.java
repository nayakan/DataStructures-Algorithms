*
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */

/**
 *
 * @author Akshatha
 */
 
public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int len = Math.max(num1.length(), num2.length());
        int sum = 0, carry = 0;
        for(int i = 1; i <= len; i++) {
            sum = carry;
            if(i <= num1.length())
                sum += num1.charAt(num1.length() - i) -'0';
            if(i <= num2.length())
                sum += num2.charAt(num2.length() - i) - '0';
            sb.append(sum % 10);
            carry = sum / 10;
        }
        if(carry > 0)
            sb.append(carry);
        return sb.reverse().toString();
    }
}
