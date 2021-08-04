package com.hw.leetcode.easy;

/**
 * 搜索插入顺序，二分查找
 */
public class Num035 {

    // 正常思维
    public int searchInsert1(int[] nums, int target) {
        if (nums == null) return 0;

        int i;

        for(i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
            if (nums[i] > target) {
                if(i-1 < 0) {
                    return 0;

                } else {
                    return  i;
                }
            }
        }
        return i;
    }

    // 二分查找
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid;
        while (left <= right) {
            mid = left + (right-left)/2;
            if (nums[mid] < target) {
                left = mid +1;
            } else if (nums[mid] == target) {
                return mid;
            } else {
                right = mid-1;
            }
        }
        if (right < 0) {
            return 0;
        }
        if(nums[right] < target ) {
            return right + 1;
        } else {
            return right;
        }
    }
}
