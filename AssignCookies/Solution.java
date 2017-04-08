/*
 * Assume you are an awesome parent and want to give your children some cookies. But, you should give each 
 * child at most one cookie. Each child i has a greed factor gi, which is the minimum size of a cookie that 
 * the child will be content with; and each cookie j has a size sj. If sj >= gi, we can assign the cookie j 
 * to the child i, and the child i will be content. Your goal is to maximize the number of your content 
 * children and output the maximum number.
 * Note: You may assume the greed factor is always positive.You cannot assign more than one cookie to one child.
 * Example 1:
 * Input: [1,2,3], [1,1]
 * Output: 1
 */

/**
 *
 * @author Akshatha
 */
 
public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        // Greedy approach
        for(int j = 0; i < g.length && j < s.length; j++) {
            if(g[i] <= s[j])
                i++;
        }
        return i;
    }
}
