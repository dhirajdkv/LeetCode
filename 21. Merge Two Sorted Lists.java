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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> arr = new ArrayList<>();
        do {
            if (list1 != null) {
                arr.add(list1.val);
                list1 = list1.next;
            }
            if (list2 != null) {
                arr.add(list2.val);
                list2 = list2.next;
            }
        } while (list1 != null || list2 != null);
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        ListNode node = new ListNode(0);
        ListNode dummy = node;
        for (int i = 0; i < arr.size(); i++) {
            dummy.next = new ListNode(arr.get(i));
            dummy = dummy.next;
        }
        return node.next;
    }
}
