package com.hw.leetcode.easy;

public final class Num026 {
    public int removeDuplicates(int[] nums) {
        if (nums == null) return 0;
        if (nums.length == 2) {
            if (nums[0] == nums[1]) return 1;
            if (nums[0] != nums[1]) return 2;
        }
        int i=0;
        int j=1;

        while(i<j && j< nums.length ) {
            if (nums[i] != nums[j] ) {
                i++;
                nums[i] = nums[j];
                j++;

            } else {
                j++;
            }
        }

        return i+1;
    }

    public static void swap(int a,int b) {
        int t;
        t = a;
        a = b;
        b = t;
    }

    public static void main(String[] args) {
        int a =2;
        int b = 3;
        Num026.swap(a,b);
        System.out.println(a);
        System.out.println(b);;
    }
}
