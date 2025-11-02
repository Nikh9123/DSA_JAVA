package LinkedList.easy ;

public class LinkedListNode {
    public int value ;
    public LinkedListNode next ;
    public String str ;
    public LinkedListNode(int value , LinkedListNode next){
        this.value = value ;
        this.next = next ;
    }
    public LinkedListNode(String str){
        this.str = str ;
        this.next = null ;
    }
    public LinkedListNode(int value){
        this.value = value ;
        this.next = null ;
    }

}