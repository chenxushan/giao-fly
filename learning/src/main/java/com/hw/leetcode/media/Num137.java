package com.hw.leetcode.media;

import java.util.HashMap;
import java.util.Map;

public class Num137 {
    /**
     * 基本的Map运算
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() ==1) {
                ans = entry.getKey();
                break;
            }
        }
        return ans;

    }
}
