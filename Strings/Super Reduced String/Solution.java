
public class Solution {
    private static String reduceString(String s) {
        Stack<Character> myStack = new Stack<>();
        int h = 0;
        
        for(char c: s.toCharArray()) {
            if(!myStack.isEmpty() && myStack.peek().equals(c)) {
                myStack.pop();
                h--;
            } else {
                myStack.push(c);
                h++;
            }
        }
        
        if(h == 0)
            return "Empty String";
        
        char[] result = new char[h];
        for(int i = h - 1; i >= 0; i--) {
            result[i] = myStack.pop();
        }
        return new String(result);
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        System.out.println(reduceString(s));
    }
}
