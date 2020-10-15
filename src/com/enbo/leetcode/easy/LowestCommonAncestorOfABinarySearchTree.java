package com.enbo.leetcode.easy;

import com.enbo.leetcode.utils.TreeNode;
import com.enbo.leetcode.utils.TreeNodeForTest;

/**
 * Created by user on 2020/7/27.
 */
public class LowestCommonAncestorOfABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }else
        if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }else{return root;}
    }

    public static void main(String[] args) {
        TreeNodeForTest treeNodeForTest = new TreeNodeForTest();
        TreeNode p = new TreeNode(1);
        TreeNode q= new TreeNode(2);
        LowestCommonAncestorOfABinarySearchTree func = new LowestCommonAncestorOfABinarySearchTree();
        func.lowestCommonAncestor(treeNodeForTest.root, p, q);

    }
}
