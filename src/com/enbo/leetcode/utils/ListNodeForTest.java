package com.enbo.leetcode.utils;

/**
 * Created by user on 2020/7/11.
 */
public class ListNodeForTest {

    public ListNode node1;
    public ListNode node2;
    public ListNode node3;
    public ListNode node4;
    public ListNode node5;
    public ListNode node6;

    private Integer DEFAULT_PRINT_LENGTH = 100;

    public ListNodeForTest(){
        node1 = new ListNode(1);
        node2 = new ListNode(2);
        node3 = new ListNode(3);
        node4 = new ListNode(4);
        node5 = new ListNode(5);
        node6 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
    }

    public void printListNode(ListNode listNode){
        printListNode(listNode, DEFAULT_PRINT_LENGTH);
    }

    public void printListNode(ListNode listNode, Integer length){
        if (length == null){length = DEFAULT_PRINT_LENGTH;}
        while(listNode != null && length-- > 0){
            System.out.print(listNode.val + " -> ");
            listNode = listNode.next;
        }
    }
}
