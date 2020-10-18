package com.peter.leetcode.homework.linear;

import com.peter.leetcode.homework.common.ListNode;
import com.peter.leetcode.homework.common.ListNodeUtils;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * You may not modify the values in the list's nodes. Only nodes itself may be changed.
 *
 */
public class SwapInPairs {
    public static void main(String[] args) {
        ListNode origin = ListNodeUtils.init();
        ListNode res = swapInPairs(origin);
        System.out.println(res);
    }

    private static ListNode swapInPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode first = null, second = null, pre = null, cur = head, res = head.next;
        while (cur != null && cur.next != null){
            first = cur;
            second = cur.next;
            first.next = second.next;
            second.next = first;
            if (pre != null) {
                pre.next = second;
            }
            pre = first;
            cur = first.next;
        }
        return res;
    }
}
