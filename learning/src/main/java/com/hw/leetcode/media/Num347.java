package com.hw.leetcode.media;

import java.util.*;
import java.util.stream.IntStream;

public class Num347 {

    public int[] topKFrequent1(int[] nums, int k) {
        Map<Integer,Integer> mapNums = new HashMap<>();

        for (int num : nums) {
            mapNums.put(num,mapNums.getOrDefault(num,0)+1);
        }
        List<Integer> rec = new ArrayList<Integer>();
        for (Map.Entry<Integer, Integer> entry : mapNums.entrySet()) {
            rec.add(entry.getKey());
        }
        Collections.sort(rec, new Comparator<Integer>() {
            public int compare(Integer value1, Integer value2) {
                return -(mapNums.get(value1) - mapNums.get(value2));
            }
        });

        return rec.subList(0, k).stream().mapToInt(Integer::valueOf).toArray();
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mapNums = new HashMap<>();

        for (int num : nums) {
            mapNums.put(num,mapNums.getOrDefault(num,0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<Map.Entry<Integer, Integer>>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        for (Map.Entry<Integer, Integer> entry : mapNums.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        List<Integer> ret = new ArrayList<Integer>();
        while (!pq.isEmpty()) {
            ret.add(pq.poll().getKey());
        }
        Collections.reverse(ret);
        return  ret.stream().mapToInt(Integer::valueOf).toArray();
    }
}
