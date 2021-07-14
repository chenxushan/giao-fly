package com.hw.jvm;

public class Jvm {
    static boolean booleanValue;
    public static void main(String[] args) {
       booleanValue = 2;

       if (booleanValue) {
           System.out.println("hello java");
       }
       if (booleanValue == true) {
           System.out.println("hello jvm");
       }
    }
}
