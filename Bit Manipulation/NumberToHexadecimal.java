/*
* Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.
* Example 1:
* Input: 26
* Output: "1a"
*
* Example 2:
* Input: -1
* Output:"ffffffff"
*/

public class IntegerToHexadecimal {
    public String toHex(int num) {
        if(num == 0)
            return "0";
        
        StringBuilder sb = new StringBuilder();
        char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        
        while(num != 0) {
            
            sb.append(map[num & 15]);
            num = num >>> 4;
        }
        return sb.reverse().toString();
    }
}
