package LinkedList.Doubly_Linked_List;

public class DoublyLinkedList<T> {
    public T value ;
    public DoublyLinkedList<T> prevNode ;
    public DoublyLinkedList<T> nextNode ;

    public DoublyLinkedList(T value){
        this.value = value ;
        this.nextNode = null ;
        this.prevNode = null ;
    }

    public DoublyLinkedList(T value, DoublyLinkedList<T> prevNode, DoublyLinkedList<T> nextNode){
        this.value = value ;
        this.nextNode = nextNode ;
        this.prevNode = prevNode ;
    }

    public DoublyLinkedList(T value , DoublyLinkedList<T> prevNode){
        this(value, prevNode, null);
    }

    public DoublyLinkedList(T value , DoublyLinkedList<T> nextNode, boolean isNextNode){
        this(value, null, nextNode);
    }

    public void printDoublyLinkedList(DoublyLinkedList<T> doublyLinkedList){
        DoublyLinkedList<T> current = doublyLinkedList;
        while (current != null) {
            System.out.print(current.value);
            if (current.nextNode != null) {
                System.out.print(" <=> ");
            }
            current = current.nextNode;
        }
        System.out.println();
    }
}
