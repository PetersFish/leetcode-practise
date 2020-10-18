package com.peter.leetcode.homework.common;

import com.peter.leetcode.homework.linear.ReverseLinkedList;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    @Override
    public String toString() {
        return val + "(->" + (next!=null?next.val:null) +")";
    }
}
