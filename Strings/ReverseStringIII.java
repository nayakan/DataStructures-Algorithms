/*
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving 
 * whitespace and initial word order.
 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 */


public class ReverseStringIII {
    public String reverseWords(String s) {
        if(s.isEmpty() || s.length() == 1)
            return s;
        String[] arr = s.split(" ");
        for(int i =0; i < arr.length; i++) {
            arr[i] = new StringBuilder(arr[i]).reverse().toString();
        }
        return String.join(" ", arr);
    }
}
