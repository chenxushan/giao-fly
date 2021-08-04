package com.hw.leetcode.media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num078 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> track = new ArrayList<>();
        backTrack(nums,0,track,res);
        return res;
    }
//    Java里面的res.add(new ArrayList<>(tmp))为什么写成res.add(tmp)就不行呢，结果全是空的
//因为 tmp在remove 后，tmp对象为空， 此时res中的path对象就为空了
//    因为你一直add 的是同一个地址，而且后面你还把地址里的值清除了
//    因为传递的是引用，所以res.add(tmp)时其实里面都是指向同一个对象。
//            tmp.remove(tmp.size() - 1)这里把共同指向的这个对象清空了最后的时候。
//    但是重新new一个就加进去不还是会为空吗
    private static void backTrack(int[] nums,int start,List<Integer> track,List<List<Integer>> res) {
        res.add(new ArrayList<>(track));
        for (int i = start;i< nums.length; i++) {
            track.add(nums[i]);
            backTrack(nums,i+1,track,res);
            track.remove(track.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,};
        List<List<Integer>> res = new ArrayList<>();
        res = subsets(nums);

    }
}
