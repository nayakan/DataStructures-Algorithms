
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * Given two arrays, write a function to compute their intersection.
 * arr1[] = {1, 3, 4, 5, 7}
 * arr2[] = {2, 3, 5, 6}
 * Then your program should print Intersection as {3, 5}. 
 */

/**
 *
 * @author Akshatha
 */
public class ArraysIntersectionI {
    
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]) {
                i++;
            }else if(nums1[i] > nums2[j]) {
                j++;
            }else {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }
        
        int[] res = new int[set.size()];
        int k = 0;
        for(int num: set) {
            res[k++] = num;
        }
        return res;
    }
    
    public int[] intersection1(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        
        for(int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        
        for(int j = 0; j < nums2.length; j++) {
            if(set.contains(nums2[j]))
                intersect.add(nums2[j]);
        }
        
        int[] result = new int[intersect.size()];
        int i = 0;
        for(Integer val: intersect) {
            result[i++] = val;
        }
        return result;
    }
}
