/*
 * Given a string and an integer k, you need to reverse the first k characters for every 2k characters 
 * counting from the start of the string. If there are less than k characters left, reverse all of them. 
 * If there are less than 2k but greater than or equal to k characters, then reverse the first k characters 
 * and leave the other as original.
 * Input: s = "abcdefg", k = 2
 * Output: "bacdfeg".
 * Restrictions: The string consists of lower English letters only.
 * Length of the given string and k will in the range [1, 10000]
 */


public class ReverseStringII {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        
        while(i < s.length()) {
            // First K
            j = (i + k) <= s.length() ? (i + k) : s.length();
            sb.append((new StringBuilder(s.substring(i, j))).reverse().toString());
            
            if(j >= s.length())
                break;
            
            // Second K
            i = j;
            j = (i + k) <= s.length() ? (i + k) : s.length();
            sb.append(s.substring(i, j));
            
            i = j;
        }
        return sb.toString();
    }
}
