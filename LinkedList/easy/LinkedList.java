package LinkedList.easy;

class LinkedListNode {
    int value ;
    LinkedListNode next ;
    String str ;
    LinkedListNode(int value , LinkedListNode next){
        this.value = value ;
        this.next = next ;
    }
    LinkedListNode(String str){
        this.str = str ;
        this.next = null ;
    }
    LinkedListNode(int value){
        this.value = value ;
        this.next = null ;
    }

}

public class LinkedList {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        LinkedListNode head = null;

        // Construct the linked list
        for (int ele : arr) {
            head = new LinkedListNode(ele, head);
        }
        System.out.println(head.next);
        // Print the linked list
        LinkedListNode current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }
}
