/*
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 * we define empty string as valid palindrome.
 */

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())
            return true;
        int start = 0, end = s.length() - 1;
        while(start < end) {
            char c1 = s.charAt(start);
            char c2 = s.charAt(end);
            if(!Character.isLetterOrDigit(c1)) {
                start++;
            } else if(Character.isLetterOrDigit(c2)) {
                end--;
            } else {
                if(c1 != c2) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
