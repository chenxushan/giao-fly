package com.hw.leetcode.easy;


//Definition for singly-linked list.
class ListNode {
     int val;
      ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Num021 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if ((l1 == null) && (l2 == null)) {
            return null;
        }
        if (l1 ==null) return l2;
        if (l2 ==null) return l1;
        ListNode head = new ListNode(-101);
        ListNode p = head;
        while(l1 != null &&l2 !=null) {
            if(l1.val >=l2.val) {
                p.next = l2;
                l2 = l2.next;
            } else {
                p.next = l1;
                l1 = l1.next;
            }
            p = p.next;
        }
        if(l1 == null) {
            p.next = l2;
        }
        if(l2 == null)  {
            p.next = l1;
        }
        head = head.next;
        return head;
    }
}