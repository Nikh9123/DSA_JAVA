package LinkedList.easy;

public class InsertANode {
    public static void printNode(LinkedListNode node) {
        LinkedListNode iterator = node;

        while (iterator != null) {
            System.out.print(iterator.value + " ==> ");
            iterator = iterator.next; // Move to next node
        }
    }

    public static Boolean searchInLinkedList(LinkedListNode stringNode, String str){

        LinkedListNode node = stringNode ;

        while (node != null) {
            if(node.str.equals(str)){
                return true ;
            }
            node = node.next ;
        }

        return false ;
    }

    public static void insertAtFirst(LinkedListNode node, int value) {
        LinkedListNode iterator = node;

        while (iterator.next != null) {
            // System.out.print(iterator.value + " ==> ");
            iterator = iterator.next; // Move to next node
        }
         
        iterator.next = new LinkedListNode(value);
        // node = iterator ;
    }

    public static Integer lengthOfLL(LinkedListNode nodeList){
        int count = 0 ;

        LinkedListNode node = nodeList ;
        while (node != null) {
            count++ ;
            node = node.next ;
        }
        return count ;
    }

    public static void main(String[] args) {
        LinkedListNode node = new LinkedListNode(1, new LinkedListNode(2, new LinkedListNode(3, null)));
        LinkedListNode node2 = new LinkedListNode(4);
        node2.next = new LinkedListNode(5);
        node2.next.next = new LinkedListNode(6);
        node2.next.next.next = new LinkedListNode(7);


        insertAtFirst(node2, 8);
        System.out.println(lengthOfLL(node2));
        printNode(node2);
        System.out.println();
        
        LinkedListNode stringNode = new LinkedListNode("XUV700") ;
        stringNode.next = new LinkedListNode("baleno");
        stringNode.next.next = new LinkedListNode("creta");
        stringNode.next.next.next = new LinkedListNode("scorpio");

        System.out.println("result is : " + searchInLinkedList(stringNode, "baleno"));

        System.out.println();
    }
}
