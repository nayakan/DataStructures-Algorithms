/*
 * Write a function that takes a string as input and returns the string reversed.
 * Given s = "hello", return "olleh".
 */
 
 public class ReverseString {
    //Naive implementation
    public String reverseString(String s) {
        if(s.isEmpty() || s.length() == 1)
            return s;
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    
    // Swapping using constant space
    public String reverseString1(String s) {
        if(s.isEmpty() || s.length() == 1)
            return s;
        int i = 0;
        int j = s.length() - 1;
        char[] str = s.toCharArray();
        while(i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        return new String(str);
    }
    
    // Iterate through only half the number of characters
    public String reverseString2(String s) {
        if(s.isEmpty() || s.length() == 1)
            return s;
        char[] str = s.toCharArray();
        for(int i = 0; i < s.length() / 2; i++) {
            char temp = str[i];
            str[i] = str[s.length() - 1 - i];
            str[s.length() - 1 - i] = temp;
        }
        return new String(str);
    }
}
