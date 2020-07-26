package com.enbo.leetcode.easy;

import java.util.Stack;

/**
 * Created by user on 2020/7/23.
 * push的时候进stack1，pop的时候从stack2走，stack2为空的话，把stack1导入stack2
 */
public class ImplementQueueUsingStacks {
    Stack<Integer> stack1,stack2;

    /** Initialize your data structure here. */
    public ImplementQueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.empty() && stack2.empty();
    }
}
