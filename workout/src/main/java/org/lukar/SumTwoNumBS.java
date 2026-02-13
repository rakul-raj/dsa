package org.lukar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumTwoNumBS {

    public static void main(String[] args) {


        int[] nums = {3,2,4};
        int target = 6;
        int[] ans = twoSum(nums, target);

        System.out.println(Arrays.toString(ans));
    }

    static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; // fallback (problem says always one solution)

    }


}
