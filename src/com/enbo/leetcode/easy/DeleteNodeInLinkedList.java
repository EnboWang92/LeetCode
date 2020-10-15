package com.enbo.leetcode.easy;

import com.enbo.leetcode.utils.ListNode;

/**
 * Created by user on 2020/7/28.
 */
public class DeleteNodeInLinkedList {
    public void deleteNode(ListNode node) {
        while(node.next != null && node.next.next != null){
            node.val = node.next.val;
            node = node.next;
        }
        node.val = node.next.val;
        node.next = null;
    }

    public static void main(String[] args) {

    }
}
