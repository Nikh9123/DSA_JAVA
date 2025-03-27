package LinkedList;

class Node {
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

public class LinkedList {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        Node head = null;

        // Construct the linked list
        for (int ele : arr) {
            head = new Node(ele, head);
        }
        System.out.println(head.next);
        // Print the linked list
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }
}
