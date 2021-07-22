package com.hw;

import java.util.*;
import java.util.stream.Collectors;

public class Common {

    public void arrayBase(){
        int[] arr=new int[6];
        int length = arr.length;
        int[] y= new int[]{1,2,3,4,5};
        int [][] intA={{1,2},{2,3},{3,4,5}};
        int [][] intC= new int[3][5];

        int [][]intB=new int[3][];
        intB[0]=new int[3];  //3
        intB[1]=new int[]{1,2,3,4};  //3
        intB[2]=new int[2];  //2
        System.out.println(intB[1]);//[I@156643d4
        System.out.println(intB[1][1]);//2

        //二维数组
        int [] intD[] ={{1,2},{2,3,4},{3,4,5,6}};
        //(1)普通for循环
        for(int i=0;i<intD.length;i++){ //0,1,2
            for(int j=0;j<intD[i].length;j++){ //每一个一维数组的长度
                System.out.print(intD[i][j]+"\t");
            }
            System.out.println();
        }
        //(2)加强for循环
        System.out.println("\n=========================");
        for(int[] arr1:intA){  //int[]二维数组中元素的类型, arr迭代变量, intA二维组的名称
            for(int i:arr1){ //int，一维数组中元素的类型，i,迭代变量,arr，一维数组的名称
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }

    public static void queueBase() {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("c");
        System.out.println(queue.peek());
        queue.offer("x");

        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
    }

    public static void stackBase(){
        Stack<String> stack = new Stack<String>();
        stack.push("c");
        stack.push("xu");
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }

    public static void mathBase() {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        int[] a = new int[]{3,2,6,4,8,2};
        // int[] 转 List<Integer>
        List<Integer> list1 = Arrays.stream(a).boxed().collect(Collectors.toList());
        Arrays.sort(a);
        // int[] 转 Integer[]
        Integer[] integers1 = Arrays.stream(a).boxed().toArray(Integer[]::new);

        // List<Integer> 转 Integer[]
        Integer[] integers2 = list1.toArray(new Integer[0]);
        //  调用toArray。传入参数T[] a。这种用法是目前推荐的。
        // List<String>转String[]也同理。
        // List<Integer> 转 int[]
        int[] arr1 = list1.stream().mapToInt(Integer::valueOf).toArray();
        // 想要转换成int[]类型，就得先转成IntStream。
        // 这里就通过mapToInt()把Stream<Integer>调用Integer::valueOf来转成IntStream
        // 而IntStream中默认toArray()转成int[]。

        // Integer[] 转 int[]
        int[] arr2 = Arrays.stream(integers1).mapToInt(Integer::valueOf).toArray();
        // 思路同上。先将Integer[]转成Stream<Integer>，再转成IntStream。

        // Integer[] 转 List<Integer>
        List<Integer> list2 = Arrays.asList(integers1);
        // 最简单的方式。String[]转List<String>也同理。
        // 同理
        String[] strings1 = {"a", "b", "c"};
        // String[] 转 List<String>
        List<String> list3 = Arrays.asList(strings1);
        // List<String> 转 String[]
        String[] strings2 = list3.toArray(new String[0]);
    }
    public static void main(String[] args) {
        //Common.queueBase();
        Common.stackBase();
    }
}
