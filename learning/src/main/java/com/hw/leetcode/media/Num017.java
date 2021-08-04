package com.hw.leetcode.media;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Num017 {

    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();
        Map<Integer,String> numMap = new HashMap<>();
        numMap.put(1,"");
        numMap.put(2,"abc");
        numMap.put(3,"def");
        numMap.put(4,"ghi");
        numMap.put(5,"jkl");
        numMap.put(6,"mno");
        numMap.put(7,"pqrs");
        numMap.put(8,"tuv");
        numMap.put(9,"wxyz");

        return result;
    }

    private static void backtrack(String digits,List<String> result,String item,Map<Integer,String> numMap) {
        if (item.length() == digits.length()) {

            result.add(item);
            return;
        }

        for (int i = 0; i< digits.length();i++) {

        }
    }

    public List<String> letterCombinations1(String digits) {
        List<String> combinations = new ArrayList<String>();
        if (digits.length() == 0) {
            return combinations;
        }
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        backtrack1(combinations, phoneMap, digits, 0, new StringBuffer());
        return combinations;
    }

    public void backtrack1(List<String> combinations, Map<Character, String> phoneMap, String digits, int index, StringBuffer combination) {
        if (index == digits.length()) {
            combinations.add(combination.toString());
        } else {
            char digit = digits.charAt(index);
            String letters = phoneMap.get(digit);
            int lettersCount = letters.length();
            for (int i = 0; i < lettersCount; i++) {
                combination.append(letters.charAt(i));
                backtrack1(combinations, phoneMap, digits, index + 1, combination);
                combination.deleteCharAt(index);
            }
        }
    }


}
