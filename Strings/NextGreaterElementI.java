/*
 * You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. 
 * Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
 * The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. 
 * If it does not exist, output -1 for this number.
 * Example : Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
 * Output: [-1,3,-1]
 * Explanation:
 * For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
 * For number 1 in the first array, the next greater number for it in the second array is 3.
 * For number 2 in the first array, there is no next greater number for it in the second array, so output -1.
 * Note: All elements in nums1 and nums2 are unique.
 * The length of both nums1 and nums2 would not exceed 1000.
 */


public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] result = new int[findNums.length];
        
        Map<Integer, Integer> valToIndex = new HashMap<>();
        for(int i =0; i < nums.length; i++) {
            valToIndex.put(nums[i], i);
        }
        
        for(int i = 0; i < findNums.length; i++) {
            result[i] = -1;
            for(int j = (valToIndex.get(findNums[i]) + 1); j < nums.length; j++ ) {
                if(nums[j] > findNums[i]) {
                    result[i] = nums[j];
                    break;
                }
            }
        }
        return result;
    }
}
