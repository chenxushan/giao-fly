package com.hw.leetcode.media;

import java.util.*;

public class Num692 {
    public static List<String> topKFrequent(String[] words, int k) {
        if(k > words.length) {
            return null;
        }

        List<String> result = new ArrayList<>();
        Map<String,Integer> wordsMap = new HashMap<>();

        for (String str : words) {
            wordsMap.putIfAbsent(str,wordsMap.getOrDefault(str,0)+1);
        }

        Arrays.sort(words,0,words.length);

        for (String str : words) {
            System.out.println(str);
        }

        return result;
    }

    public static List<String> topKFrequent1(String[] words, int k) {
        Map<String, Integer> cnt = new HashMap<String, Integer>();
        for (String word : words) {
            cnt.put(word, cnt.getOrDefault(word, 0) + 1);
        }
        List<String> rec = new ArrayList<String>();
        for (Map.Entry<String, Integer> entry : cnt.entrySet()) {
            rec.add(entry.getKey());
        }
        Collections.sort(rec, new Comparator<String>() {
            public int compare(String word1, String word2) {
                return cnt.get(word1) == cnt.get(word2) ? word1.compareTo(word2) : cnt.get(word2) - cnt.get(word1);
            }
        });
        return rec.subList(0, k);
    }

    public static void main(String[] args) {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        List<String> result = topKFrequent1(words,1);
        for (String s: result) {
            System.out.printf(s);
        }
    }
}
