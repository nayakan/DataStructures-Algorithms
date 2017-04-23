/*
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * Example 1:
 * Given s = "hello", return "holle".
 */

public class ReverseVowels {
    private static final String vowels = "aeiouAEIOU";
    
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] array = s.toCharArray();
        while(start < end) {
            while(start < end && vowels.indexOf(array[start]) == -1) {
                start++;
            }
            while(start < end && vowels.indexOf(array[end]) == -1) {
                end--;
            }
            
            char tmp = array[start];
            array[start] = array[end];
            array[end] = tmp;
            
            start++;
            end--;
        }
        return new String(array);
    }
}
