/*
 * Implement strStr().
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */

public class Strstr {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0)
            return 0;
        int j;
        int range = haystack.length() - needle.length() + 1;
        for(int i = 0; i < range; i++) {
            for(j = 0; j < needle.length(); j++) {
                if(haystack.charAt(i + j) != needle.charAt(j))
                    break;
            }
            if(j == needle.length())
                return i;
                
        }
        return -1;
    }
}
