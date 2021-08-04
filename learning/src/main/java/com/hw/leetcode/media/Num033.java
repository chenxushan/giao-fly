package com.hw.leetcode.media;

public class Num033 {
    public int search(int[] nums, int target) {

        int i = 0;
        int j = nums.length-1;
        if (target>nums[j] && target < nums[i]) {
            return -1;
        }
        while (i<=j) {
            if (nums[i] == target) {
                return i;
            }
            if (nums[j] == target) {
                return j;
            }
            i++;
            j--;
        }

        return -1;
    }
    public int search1(int[] nums, int target) {


        int left = 0;
        int right = nums.length-1;

        while(right <= right) {
            int mid = left+(right-left)/2;

            if (nums[mid] == target) {
                return mid;
            }
            if (target < nums[mid] && target > nums[left]) {
                right = mid-1;
            }
            if (target > nums[mid] && target>nums[left]) {
                left = mid+1;
            }
            if (target < nums[right] && target> nums[mid]) {
                left = mid+1;
            }
            if (target < nums[mid]  && target < nums[right]) {
                right = mid-1;
            }
        }

        return -1;
    }

    public int search2(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        }
        if (n == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[l] <= nums[mid]) {
                if (nums[l] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}
