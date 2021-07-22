package com.hw.leetcode.easy;

import sun.lwawt.macosx.CSystemTray;

import java.util.LinkedList;


public class Num020 {
    //
    public boolean isValid(String s) {
        LinkedList<String> stack = new LinkedList();

        int i;
        for (i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(String.valueOf(s.charAt(i)));
                continue;
            }
            if (isRe(stack.peek(),(String.valueOf(s.charAt(i))))) {
                stack.pop();
            } else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        if (stack.isEmpty()) {
            return true;
        }


        return false;
    }

    private static boolean isRe(String s1,String s2) {
        if (s1.equals("(") && s2.equals(")")) return true;
        if (s1.equals("[") && s2.equals("]")) return true;
        if (s1.equals("{") && s2.equals("}")) return true;
        return false;
    }
    public static void main(String[] args) {
        String s = "({})";
        Num020 num020 = new Num020();
        System.out.println(num020.isValid(s));
    }
}
