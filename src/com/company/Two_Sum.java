package com.company;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

    // This a a code written by DroneCodes

    // This is a solution to the Two Sum problem in leetcode

    // i hope it helps :)

    public class TwoSum {

        public int[] twoSum(int[] nums, int target) {
            // Array to store result
            int[] result = new int[2];
            // This map will store the difference and the corresponding index
            Map<Integer, Integer> map = new HashMap<>();
            // Loop through the entire array
            for (int i = 0; i < nums.length; i++) {
                // If we have seen the current element before
                // It means we have already encountered the other number of the pair
                if (map.containsKey(nums[i])) {
                    // Index of the current element
                    result[0] = i;
                    // Index of the other element of the pair
                    result[1] = map.get(nums[i]);
                }
                // If we have not seen the current before
                // It means we have not yet encountered any number of the pair
                else {
                    // Save the difference of the target and the current element
                    // with the index of the current element
                    map.put(target - nums[i], i);
                }
            }
            return result;
        }
    }

    // Here is another solution i got from Stack Overflow and i would try my best to simplify it in the coming days

    public int[] twoSum(int[] nums, int target) {
        if(nums==null || nums.length<2)
            return new int[]{0,0};

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }else{
                map.put(target-nums[i], i);
            }
        }

        return new int[]{0,0};
    }
}
