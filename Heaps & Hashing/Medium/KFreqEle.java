// https://leetcode.com/problems/top-k-frequent-elements/
// Not Completed.

import java.util.*;

public class KFreqEle {
    public static void topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int maxFreq = 0;

        for(Integer n : map.keySet()) {
           maxFreq = Math.max(maxFreq, map.get(n));
        }

        int i = 0;

        for (Integer key : map.keySet()) {
            if (map.get(key) == maxFreq) {
                System.out.print(key + " ");
                maxFreq--;
                i++;

                if(i == k) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 1, 2, 2, 3};
        topKFrequent(nums, 2);
    }
}