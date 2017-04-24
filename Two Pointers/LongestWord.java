
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Given a string and a string dictionary, find the longest string in the dictionary that can be formed by deleting some characters
 * of the given string. If there are more than one possible results, return the longest word with the smallest lexicographical order.
 * If there is no possible result, return the empty string.
 * Example 1:
 * Input: s = "abpcplea", d = ["ale","apple","monkey","plea"]
 * Output: "apple"
 */

public class LongestWord {
    public String findLongestWord(String s, List<String> d) {
        if(s.length() == 0 | d.size() == 0)
            return "";
        
        Collections.sort(d, (a, b) -> {
            if(a.length() != b.length())
                    return b.length() - a.length();
            return a.compareTo(b);
        });
        
        for(String string: d) {
            if(s.length() < string.length())
                continue;
            if(isSubSeq(s, string))
                return string;
        }
        return "";
    }
    
    private boolean isSubSeq(String s, String string) {
        int i = 0, j = 0;
        while(i < s.length() && j < string.length()) {
            if(s.charAt(i) == string.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == string.length();
    }
}
