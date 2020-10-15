package com.enbo.leetcode.easy;


import com.enbo.leetcode.utils.TreeNode;
import com.enbo.leetcode.utils.TreeNodeForTest;
import javafx.util.Pair;
import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * Created by user on 2020/7/28.
 */
public class BinaryTreePaths {
    //recursion breadth-first
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result= new ArrayList<>();
        if(null == root){return result;}
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<String> pathQueue = new LinkedList<>();
        nodeQueue.add(root);
        pathQueue.add(String.valueOf(root.val));
        while(!nodeQueue.isEmpty()){
            TreeNode head = nodeQueue.poll();
            String path = pathQueue.poll();
            if(null == head.left && null == head.right){result.add(path);}
            if(null != head.left){
                nodeQueue.add(head.left);
                pathQueue.add(path + "->" + head.left.val);
            }
            if(null != head.right){
                nodeQueue.add(head.right);
                pathQueue.add(path + "->" + head.right.val);
            }
        }
        return result;
    }

    //recursion    deep-first
    public List<String> binaryTreePaths2(TreeNode root) {
        List<String> result= new ArrayList<>();
        if(null == root){return result;}
        recursion(root,"", result);
        return result;
    }
    public void recursion(TreeNode node, String path, List<String> result){
        path += node.val;
        if(null == node.left && null == node.right){result.add(path);}
        if(null != node.left){
            recursion(node.left, path + "->", result);
        }
        if(null != node.right){
            recursion(node.right, path + "->", result);
        }
    }

    //Iteration deep-first
    public List<String> binaryTreePaths1(TreeNode root) {
        List<String> result= new ArrayList<>();
        if(null == root){return result;}
        Pair<String, TreeNode> pair = new Pair<>(String.valueOf(root.val), root);
        Stack<Pair<String, TreeNode>> stack = new Stack<>();
        stack.push(pair);
        while(!stack.isEmpty()){
            Pair<String, TreeNode> pop = stack.pop();
            String path = pop.getKey();
            TreeNode node = pop.getValue();
            if(node.left == null && node.right == null){
                result.add(path);
            }
            if(null != node.left){
                stack.push(new Pair<>(path + "->" + String.valueOf(node.left.val) , node.left));
            }
            if(null != node.right){
                stack.push(new Pair<>(path + "->" + String.valueOf(node.right.val), node.right));
            }
        }
        return result;
    }

    public String printWithInterval(ArrayList<Integer> arrayList){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            stringBuilder.append(arrayList.get(i).toString()).append("->");
        }
        stringBuilder.append(arrayList.get(arrayList.size() - 1).toString());
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        BinaryTreePaths binaryTreePaths = new BinaryTreePaths();
        TreeNodeForTest treeNodeForTest = new TreeNodeForTest();
        for (String s : binaryTreePaths.binaryTreePaths(treeNodeForTest.root)) {
            System.out.println(s);
        }
    }
}
