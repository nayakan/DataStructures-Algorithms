/* Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */

public class Solution {
    public int maxSubArray(int[] nums) {
        return subArray(nums, 0, nums.length - 1);
    }
    
    public int subArray(int[] nums, int low, int high) {
        if(low == high)
            return nums[low];
            
        int mid = (low + high) / 2;
        int leftSum = subArray(nums, low, mid);
        int rightSum = subArray(nums, mid + 1, high);
        int crossSum = maxCrossSubArray(nums, low, mid, high);
        if(leftSum >= rightSum && leftSum >= crossSum)
            return leftSum;
        if(rightSum >= leftSum && rightSum >= crossSum)
            return rightSum;
        return crossSum;
    }
    
    public int maxCrossSubArray(int[] nums, int low, int mid, int high) {
        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        int sum1 = 0;
        for(int i = mid; i >= low; i--) {
            sum1 += nums[i];
            if(sum1 > leftSum) {
                leftSum = sum1;
            }
        }
        int sum2 = 0;
        for(int j = mid + 1; j <= high; j++) {
            sum2 += nums[j];
            if(sum2 > rightSum) {
                rightSum = sum2;
            }
        }
        return leftSum + rightSum;
    }
}
