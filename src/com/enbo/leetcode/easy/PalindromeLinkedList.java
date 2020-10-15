package com.enbo.leetcode.easy;

import com.enbo.leetcode.utils.ListNode;
import com.enbo.leetcode.utils.ListNodeForTest;

/**
 * Created by user on 2020/7/23.
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        pointer = head;
        return recursively(head);
    }

    private ListNode pointer;

    public  boolean recursively(ListNode head){
        if(head == null){
            return true;
        }
        if(!recursively(head.next) || head.val != pointer.val){return false;}
        pointer = pointer.next;
        return true;
    }

    public static void main(String[] args) {
        ListNodeForTest listNodeForTest = new ListNodeForTest();
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        listNodeForTest.node1.val = 1;
        listNodeForTest.node2.val = 2;
        listNodeForTest.node3.val = 3;
        listNodeForTest.node4.val = 3;
        listNodeForTest.node5.val = 2;
        listNodeForTest.node6.val = 1;
        System.out.println(palindromeLinkedList.isPalindrome(listNodeForTest.node1));
        listNodeForTest.node1.val = 1;
        listNodeForTest.node2.val = 2;
        listNodeForTest.node3.val = 3;
        listNodeForTest.node4.val = 6;
        listNodeForTest.node5.val = 2;
        listNodeForTest.node6.val = 1;
        System.out.println(palindromeLinkedList.isPalindrome(listNodeForTest.node1));
    }
}
