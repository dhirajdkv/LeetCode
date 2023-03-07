/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a1 = l1, a2 = l2;
        int adder = 0;
        List<ListNode> vals = new ArrayList<>();
        do {
            int sum = (a1 != null ? a1.val : 0) + (a2 != null ? a2.val : 0) + adder;
            adder = 0;
            if (sum >= 10) {
                adder = sum/10;
                vals.add(new ListNode(sum%10));
            } else {
                vals.add(new ListNode(sum));
            }
            a1 = a1 != null ? a1.next : null;
            a2 = a2 != null ? a2.next : null;
        }while(a1 != null || a2 != null);
        if (adder > 0) {
            vals.add(new ListNode(adder));
        }
        ListNode finalNode = vals.get(0);
        ListNode dedupNode = finalNode;
        for (int i = 1; i < vals.size(); i++) {
            dedupNode.next = vals.get(i);
            dedupNode = vals.get(i);
        }
        return finalNode;
    }
}
