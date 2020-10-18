package com.peter.leetcode.homework.linear;

import com.peter.leetcode.homework.common.ListNode;
import com.peter.leetcode.homework.common.ListNodeUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 *
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 *
 * Follow up:
 *
 * Can you solve it using O(1) (i.e. constant) memory?
 */
public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode origin = ListNodeUtils.initCycled();
        boolean hasCycle = hasCycle(origin);
        System.out.println(hasCycle);
    }


    /*
    walkthrough:
    迭代过程中，如果发现重复的节点，即为true
     */
    public static boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode h = head;
        while (h != null){
            ListNode temp = h;
            if (set.contains(temp)) {
                return true;
            }
            set.add(temp);
            h = h.next;
        }
        return false;
    }
}
