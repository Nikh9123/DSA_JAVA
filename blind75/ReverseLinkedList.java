package blind75;


class ListNode {
    int value;
    ListNode next;

    ListNode() {
    }

    ListNode(int value) {
        this.value = value;
    }

    ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null){
            return null ;
        }
        ListNode prevNode = null;
        ListNode currNode = head ;
        ListNode nextNode = head.next ;

        while (currNode != null) {
            currNode.next = prevNode ;
            prevNode = currNode ;
            currNode = nextNode ;

            if(nextNode != null){
                nextNode = nextNode.next ; 
            }
        }
        return prevNode ;
    }

    private void printLinkedList(ListNode head){
        ListNode currentNode = head ;

        while (currentNode != null) {
            System.out.print(currentNode.value + "->");
            currentNode = currentNode.next ;
        }
        System.out.println();
    }
    public  void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("print before reversing : ");
        printLinkedList(head);
        head = reverseList(head);
        System.out.println("print after reversing : ");
        printLinkedList(head);
    }
}
