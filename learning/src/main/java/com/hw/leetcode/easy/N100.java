package com.hw.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class N100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> p1Inorder = new ArrayList<>();
        List<Integer> p2Inorder = new ArrayList<>();
        List<Integer> p1Preorder = new ArrayList<>();
        List<Integer> p2Preorder = new ArrayList<>();
        inorder(p,p1Inorder);
        inorder(q,p2Inorder);
        preorder(p,p1Preorder);
        preorder(q,p2Preorder);
        if (isSame(p1Inorder,p2Inorder) && isSame(p1Preorder,p2Preorder)) {
            return true;
        }
        return false;
    }

    private static void inorder(TreeNode root, List<Integer> arr) {
        if (root == null) {
            return ;
        }
        inorder(root.left,arr);
        arr.add(Integer.valueOf(root.val));
        inorder(root.right,arr);
    }

    private static void preorder(TreeNode root, List<Integer> arr) {
        if (root == null) {
            return ;
        }
        arr.add(Integer.valueOf(root.val));
        preorder(root.left,arr);
        preorder(root.right,arr);
    }

    private static boolean isSame(List<Integer> list1,List<Integer> list2) {
        if (list1.size() != list2.size())  return false;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i)  != list2.get(i)) {
                return false;
            }

        }
        return true;
    }
}

/**
 * Definition for a binary tree node. */
class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
        TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
      }
  }
