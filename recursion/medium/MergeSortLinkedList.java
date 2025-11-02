package recursion.medium;

import LinkedList.easy.LinkedListNode;

public class MergeSortLinkedList {
    LinkedListNode findMidOfLinkedList(LinkedListNode head){
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while (slow.next == null || fast.next.next == null) {
            slow = slow.next ;
            fast = fast.next.next ;
        }
    }

    LinkedListNode divideLinkedList(LinkedListNode head){
        if(head.next == null || head.next.next == null){
            return head ;
        }
        LinkedListNode left = divideLinkedList(head.next);
        LinkedListNode right = divideLinkedList(head.next.next);

        return left.next = right ;
    }
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(5);
        head.next = new LinkedListNode(4);
        head.next.next = new LinkedListNode(3);
        head.next.next.next = new LinkedListNode(2);
        head.next.next.next.next = new LinkedListNode(1);
        head.next.next.next.next.next = new LinkedListNode(0);
    }
}
