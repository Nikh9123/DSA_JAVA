package LinkedList.easy;

import java.util.Scanner;

class Node {
    int value;
    Node next;

    Node(int x) {
        this.value = x;
    }

}

public class DeleteNode {
    public static void printLinkedList(Node heaNode) {
        Node currNode = heaNode;

        while (currNode != null) {
            System.out.print(currNode.value + "-->");
            currNode = currNode.next;
        }
        System.out.print("null");
    }

    public static void deleteNode(Node node) {
        if (node.next != null) {

            node.value = node.next.value;
            node.next = node.next.next;
        }
        else{
            node.value = Integer.MIN_VALUE; // Mark the node as deleted
            node.next = null; // Disconnect the node
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of nodes:");

        int n = scanner.nextInt();
        Node head = null, tail = null;

        System.out.println("Enter the values of the nodes:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.println("Enter the value of the node to delete:");
        int deleteValue = scanner.nextInt();
        scanner.close();

        Node current = head;
        while (current != null) {
            System.out.println("current node value :" + current.value);
            if (current.value == deleteValue) {
                System.out.println("Before deleting the Linked List");
                printLinkedList(head);
                deleteNode(current);
                System.out.println("\nAfter deleting the Linked List");
                printLinkedList(head);
                return;
            }
            current = current.next;
        }
        System.out.println("Node with value " + deleteValue + " not found in the list.");
        System.out.println("After deleting the Linked List");
        printLinkedList(head);
    }

}