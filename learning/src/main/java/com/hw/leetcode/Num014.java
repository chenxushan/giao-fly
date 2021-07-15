package com.hw.leetcode;

public class Num014 {

    public String longestCommonPrefix(String[] strs) {


        if (strs == null || strs.length == 0) {
            return "";
        }
        String longestPrefix = strs[0];
        for (int i = 1; i < strs.length; i++){
            longestPrefix = longestCommPrefixTwo(longestPrefix,strs[i]);
            if (longestPrefix.length() == 0){
                break;
            }
        }
        return longestPrefix;
    }

    public String longestCommPrefixTwo(String s1,String s2) {
        int length = Math.min(s1.length(),s2.length());

        int i;
        for ( i = 0;i < length;i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                break;
            }
        }
        return s1.substring(0,i-1);
    }

    public String longestCommonPrefix1(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        int count = strs.length;
        for (int i = 1; i < count; i++) {
            prefix = longestCommonPrefix(prefix, strs[i]);
            if (prefix.length() == 0) {
                break;
            }
        }
        return prefix;
    }

    public String longestCommonPrefix(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        int index = 0;
        while (index < length && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }
        return str1.substring(0, index);
    }


}
