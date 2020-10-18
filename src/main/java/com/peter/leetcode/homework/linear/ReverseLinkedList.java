package com.peter.leetcode.homework.linear;

import com.peter.leetcode.homework.common.ListNode;

import static com.peter.leetcode.homework.common.ListNodeUtils.init;

public class ReverseLinkedList {

    // 遍历的时候，把指针都反向即可
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null, cur = null;
        while (head != null) {
            cur = head;
            head = head.next;
            cur.next = pre;
            pre = cur;
        }
        return cur;
    }

    public static void main(String[] args) {
        ListNode origin = init();
        // 递归
//        ListNode res = appendToLast(origin, origin.next);
        ListNode res = reverseList(origin);
        System.out.println(res);
    }

    private static ListNode appendToLast(ListNode origin, ListNode next) {
        // 先将子集用递归排序
        if (origin == null || next == null) {
            return origin;
        }
        next = appendToLast(next, next.next);
        origin.next = null;
        ListNode tail = next;
        while (tail.next != null){
            tail = tail.next;
        }
        tail.next = origin;
        return next;
    }
}
