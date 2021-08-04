package com.hw.leetcode.diff;


import java.util.HashMap;
import java.util.Map;

/**
 * 最小覆盖子串
 */
public class Num076 {
    public static String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }
        int left = 0;
        int right = 0;

        Map<Character,Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c,tMap.getOrDefault(c,0)+1);
        }
        System.out.println(tMap.toString());
        Map<Integer,Integer> result = new HashMap<>();
        Map<Character,Integer> tmpMap = new HashMap<>();
        while (right < s.length()) {

            char c = s.charAt(right);
            if (tmpMap.equals(tMap)){

                result.put(left,right-left);

                while(!tMap.containsKey(s.charAt(left))) {
                    left ++;

                }
                tmpMap.put(s.charAt(left),tmpMap.get(s.charAt(left))-1);
                left++;
            }
            if (tMap.containsKey(s.charAt(right))) {
                tmpMap.put(s.charAt(right),tmpMap.getOrDefault(s.charAt(right),0)+1);
            }
            right++;

        }
        System.out.println(result.toString());
        Integer min = s.length();
        Integer flag = 0;
        for (Map.Entry<Integer,Integer> entry: result.entrySet()) {
            System.out.println(entry.getKey() +":"+ entry.getValue());
            if (entry.getValue() < min) {
                min = entry.getValue();
                flag = entry.getKey();
            }
        }

        return s.substring(flag,flag+min);

    }







    public static String minWindow1(String s, String t) {


        Map<Character,Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c,need.getOrDefault(c,0)+1);
        }
        Map<Character,Integer> window = new HashMap<>();
        int left = 0;
        int right = 0;
        int flag = 0;
        int start =0;
        int len = Integer.MAX_VALUE;
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            if (need.containsKey(c)) {
                window.put(c,window.getOrDefault(c,0)+1);
                if (need.get(c) == window.get(c)) {
                    flag++;
                }
            }

            while(flag == need.size()) {
                if (right - left < len) {
                    start = left;
                    len = right-left;
                }
                char d = s.charAt(left);
                left++;
                if (need.containsKey(d)) {
                    if (window.get(d) == need.get(d)) {
                        flag--;
                    }
                    window.put(d,window.getOrDefault(d,0)-1);

                }
            }

        }

        return len == Integer.MAX_VALUE ? "":s.substring(start,start+len);

    }

    public static void main(String[] args) {
        String s  = "ADOBECODEBANC";
        String t = "ABC";
        minWindow(s,t);
    }
}
