package LinkedList.Doubly_Linked_List.easy;

import LinkedList.Doubly_Linked_List.DoublyLinkedList;

public class DeleteNode {
    public static DoublyLinkedList<Integer> deleteNode(DoublyLinkedList<Integer> doublyLinkedList, int x) {
        // code here
        DoublyLinkedList<Integer> currnode = doublyLinkedList ;
        
        


    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>(2);

        doublyLinkedList.prevNode = new DoublyLinkedList<Integer>(1);
        doublyLinkedList.prevNode.nextNode = doublyLinkedList;
        

        doublyLinkedList.nextNode = new DoublyLinkedList<Integer>(3);
        doublyLinkedList.nextNode.prevNode = doublyLinkedList ;

        doublyLinkedList.nextNode.nextNode = new DoublyLinkedList<Integer>(4);
        doublyLinkedList.nextNode.nextNode.prevNode = doublyLinkedList.nextNode ;

        doublyLinkedList = doublyLinkedList.prevNode ;

        doublyLinkedList.printDoublyLinkedList(doublyLinkedList);
   
       deleteNode(doublyLinkedList, 2);
       doublyLinkedList.printDoublyLinkedList(doublyLinkedList.prevNode);
    }
}
