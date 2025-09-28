package blind75;

import java.util.ArrayList;
import java.util.Collections;

//*singly linked list */
class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }

    ListNode() {
    }

    ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(lists.length);

        for (int i = 0; i < lists.length; i++) {
            while (lists[i] != null) {
                System.out.print(lists[i].value + " ");
                arrayList.add(lists[i].value);
                lists[i] = lists[i].next;
            }
        }

        Collections.sort(arrayList);

        // create a dummy node
        ListNode dummy = new ListNode();
        ListNode current = dummy; // pointer

        for (int i = 0; i < arrayList.size(); i++) {
            current.next = new ListNode(arrayList.get(i));
            current = current.next;
        }

        // real head of the linked list
        ListNode head = dummy.next;

        return head;
    }
}

public class MergeKSortedList {
    // [[1,4,5],[1,3,4],[2,6]]
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println();
        // first list 1->4->5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(5);

        // second list 1->3->5
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(5);

        // third list 2->6
        ListNode list3 = new ListNode(2);
        list3.next = new ListNode(6);

        ListNode list[] = new ListNode[] { list1, list2, list3 };

        ListNode arr = s.mergeKLists(list);

        while (arr.next != null) {
            System.out.print(arr.value + " ");
            arr = arr.next;
        }
        System.out.println();
    }
}
