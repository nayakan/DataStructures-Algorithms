/* Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 * IMPLEMENTED USING KADANE'S ALGORITHM - Linear time algorithm 
 * Rather than the Divide and Conquer approach which has time complexity O(nlogn)
 */

public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null)
            return 0;
            
        int max_so_far = nums[0];
        int max_ending_here = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
            max_ending_here += nums[i];
            if(nums[i] > max_ending_here)
                max_ending_here = nums[i];
            if(max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }
}

  


