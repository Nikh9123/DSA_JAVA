package LinkedList.Doubly_Linked_List.easy;

import LinkedList.Doubly_Linked_List.DoublyLinkedList;

public class InsertNodeatFirst {
    public static DoublyLinkedList<Integer> insertNodeatFirst(int nodeValue, DoublyLinkedList<Integer>doublyLinkedListNode){

        DoublyLinkedList<Integer> currentNode = doublyLinkedListNode ;
        if(currentNode.prevNode == null){
            currentNode.prevNode = new DoublyLinkedList<Integer>(nodeValue) ;
            currentNode.prevNode.nextNode = currentNode ;
            return currentNode ;
        }

        while(currentNode.prevNode != null){
            currentNode = currentNode.prevNode ;
        }
        
        currentNode.prevNode = new DoublyLinkedList<Integer>(nodeValue) ; 
        currentNode.prevNode.nextNode = currentNode ;
        return currentNode ;
    }

    
    public static void main(String[] args) {
        DoublyLinkedList<Integer> node = new DoublyLinkedList<Integer>(2);

        //creating the next Node 
        node.nextNode = new DoublyLinkedList<Integer>(3) ;
        //linking the nextNode to it's previous node 
        node.nextNode.prevNode = node;

        //creating the previous node
        node.prevNode = new DoublyLinkedList<Integer>(1);
        //linking the previous node to it's next node
        node.prevNode.nextNode = node ;

        node = insertNodeatFirst(0, node);

        node.printDoublyLinkedList(node.prevNode);
    }
}
