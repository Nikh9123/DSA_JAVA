package blind75;

public class MergeSortedList {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode currListNode1 = list1 ;
        ListNode currListNode2 = list2 ;
        ListNode ansListNode = new ListNode();
        ListNode trackerListNode = ansListNode ;

        while (currListNode1 != null && currListNode2 != null) {
            if(currListNode1.value <= currListNode2.value){
                ansListNode.next = new ListNode(currListNode1.value) ;
                currListNode1 = currListNode1.next ;
            }else{
                ansListNode.next = new ListNode(currListNode2.value) ;
                currListNode2 = currListNode2.next ;
            }
            ansListNode = ansListNode.next ;
        }

        while (currListNode1 != null) {
            ansListNode.next = new ListNode(currListNode1.value);
            ansListNode = ansListNode.next ;
            currListNode1 = currListNode1.next ;
        }

        while (currListNode2 != null) {
            ansListNode.next = new ListNode(currListNode2.value);
            ansListNode = ansListNode.next ;
            currListNode2 = currListNode2.next ;
        }

        return trackerListNode.next ;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1) ;
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head.next.next = new ListNode(4);

        ListNode sortedLinkedList = mergeTwoLists(head, head2);

        ListNode currListNode = sortedLinkedList ;

        while (currListNode != null) {
            System.out.print(currListNode.value + "-->");
            currListNode = currListNode.next ;
        }

    }
}
