package com.enbo.leetcode.easy;

import com.enbo.leetcode.utils.ListNode;
import com.enbo.leetcode.utils.ListNodeForTest;

/**
 * Created by user on 2020/7/11.
 */
public class ReverseLinkedList {

    //recursively
    public ListNode reverseList(ListNode head) {
        if(null == head || null == head.next){return head;}
        ListNode result = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return result;
    }

    //iteratively
    public ListNode reverseList1(ListNode head) {
        if(null == head || null == head.next){return head;}
        ListNode first = new ListNode(0);
        while(head != null){
            ListNode tmpFirst = first.next;
            first.next = head;
            ListNode tmpHead = head.next;
            head.next = tmpFirst;
            head = tmpHead;
        }
        return first.next;
    }

    public static void main(String[] args) {
        ListNodeForTest nodeTest = new ListNodeForTest();
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        nodeTest.printListNode(reverseLinkedList.reverseList(nodeTest.node1));
    }
}
