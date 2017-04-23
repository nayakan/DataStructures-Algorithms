
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
 * Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array. 
 * Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their 
 * absolute difference is k.
 */

public class KDiff {
    // Using two HashSets
    public int findPairs(int[] nums, int k) {
        int ans = 0;
        if(nums.length == 0 || k < 0)
            return ans;
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        if(k == 0) {
            for(int n: nums) {
                if(!set1.contains(n))
                    set1.add(n);
                else {
                    set1.remove(n);
                    if(!set2.contains(n))
                        ans++;
                    set2.add(n);
                }
            }
            
        } else {
            for(int n: nums) {
                set1.add(n);
                set2.add(n + k);
            }
            set1.retainAll(set2);
            ans = set1.size();
        }
        return ans;
    }
    
    //Using single HashMap
    public static int findPairs1(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(k == 0) {
                if(entry.getValue() >= 2)
                    count++;
            } else {
                if(map.containsKey(entry.getKey()+k))
                    count++;
                
            }
        }
        return count;
    }
}
