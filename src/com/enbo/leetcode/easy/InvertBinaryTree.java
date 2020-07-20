package com.enbo.leetcode.easy;

/**
 * Created by user on 2020/7/20.
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(null == root){return null;}
        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public static void main(String[] args) {
        TreeNodeForTest treeNodeForTest = new TreeNodeForTest();
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        invertBinaryTree.invertTree(treeNodeForTest.root);
        treeNodeForTest.printBreadthFirst();
    }
}
