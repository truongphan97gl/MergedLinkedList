public class Solution {
    public ListNode mergeTwoLists(LinkedList l1, LinkedList l2) {
        ListNode current1 = l1;
        ListNode current2 = l2;
        ListNode result = null;
        while( current1 != null && current2 != null) {
            if (current1.data < current2.data) {
                result.next = current1;
                current1 = current1.next;
            } else {
                result.next = current2;
                current2 = current2.next;
            }
        }
        return result;
    }
}
