package LinkedList;

class Node{
    int value ;
    Node next ;

    Node(int value , Node next){
        this.value = value ;
        this.next = next ;
    }
    
    Node(int value){
        this.value = value ;
        this.next = null ;
    }
}

public class InsertAtEnd {

    public static void printLinkedList(Node heaNode){
        Node currNode = heaNode;

        while(currNode != null){
            System.out.print(currNode.value + "-->");
            currNode = currNode.next ;
        }
        System.out.print("null");
    }

    // Function to insert a node at the end of the linked list.
    public static Node insertAtEnd(Node head, int x) {
        // code here
        Node currNode = head ;
        while (currNode.next != null) {
            currNode = currNode.next ;
        }
        currNode.next = new Node(x);

        return head ;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5} ;
        int x = 6 ;

        Node head = null ;
        for(int ele : arr){
            head = new Node(ele, head);
        }
        System.out.println(head);
        printLinkedList(head);
        insertAtEnd(head, x);
        printLinkedList(head);
    }
}
