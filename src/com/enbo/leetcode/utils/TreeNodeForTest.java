package com.enbo.leetcode.utils;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by user on 2020/7/20.
 */
public class TreeNodeForTest {
    public TreeNode root;
    public TreeNode node1;
    public TreeNode node2;
    public TreeNode node3;
    public TreeNode node4;
    public TreeNode node5;
    public TreeNode node6;
    public TreeNode node7;

    public TreeNodeForTest(){
        this(0,1,2,3,4,5,6,7);
    }

    public TreeNodeForTest(int r, int num1, int num2, int num3, int num4, int num5, int num6, int num7){
        root = new TreeNode(r);
        node1 = new TreeNode(num1);
        node2 = new TreeNode(num2);
        node3 = new TreeNode(num3);
        node4 = new TreeNode(num4);
        node5 = new TreeNode(num5);
        node6 = new TreeNode(num6);
        node7 = new TreeNode(num7);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node3.left = node7;
    }

    /**
     * depth first print
     */
    public void printDepthFirst() {
        printDepthFirst(root);
    }

    public void printDepthFirst(TreeNode treeNode){
        if(null == treeNode) {return;}
        System.out.print(treeNode.val + ", ");
        printDepthFirst(treeNode.left);
        printDepthFirst(treeNode.right);
    }

    /**
     * Breadth first print
     */
    public void printBreadthFirst(){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.print(node.val + ", ");
           if(null != node.left){queue.add(node.left);}
           if(null != node.right){queue.add(node.right);}
        }
    }
}
