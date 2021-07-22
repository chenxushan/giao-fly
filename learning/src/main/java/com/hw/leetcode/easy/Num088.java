package com.hw.leetcode.easy;

public class Num088 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mergeNums = new int[m+n];
        int index = 0;
        int i=0,j=0;
        while( i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                mergeNums[index] = nums1[i];
                i++;

            } else {
                mergeNums[index] = nums1[j];
                j++;

            }
            index++;
        }
        if (i == m) {
            while (j < n) {
                mergeNums[index] = nums2[j];
                j++;
                index++;
            }
        }
        if (j == n) {
            while (i < m) {
                mergeNums[index] = nums1[i];
                i++;
                index++;
            }
        }
        for (int x = 0; x != m + n; ++x) {
            nums1[x] = mergeNums[x];
        }

    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        Num088.merge(nums1,3,nums2,3);
        for (int i = 0; i < 6; i++) {
            System.out.println(nums1[i]);
        }
    }
}
