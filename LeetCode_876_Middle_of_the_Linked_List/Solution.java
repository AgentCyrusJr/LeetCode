//link: https://leetcode.com/problems/middle-of-the-linked-list/description/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int len = 0, mid_index;
        ListNode iter_head = head;
        while(iter_head != null){
            len++;
            iter_head = iter_head.next;
        }
        
        mid_index = len/2;
        int i = 0;
        while(i<mid_index){
            head = head.next; i++;
        }
        return head;
    }
}