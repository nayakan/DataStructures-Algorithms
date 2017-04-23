/*
 * Write a function that takes a string as input and returns the string reversed.
 * Given s = "hello", return "olleh".
 */

public class ReverseString {
    public String reverseString(String s) {
        if(s.isEmpty() || s.length() == 1) 
            return s;
        int start = 0;
        int end = s.length() - 1;
        char[] array = s.toCharArray();
        while(start < end) {
            char tmp = array[start];
            array[start] = array[end];
            array[end] = tmp;
            start++;
            end--;
        }
        return new String(array);
    }
}
