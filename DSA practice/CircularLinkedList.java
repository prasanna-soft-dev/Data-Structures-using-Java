import java.util.*;
public class CircularLinkedList {
    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    private Node head = null;
    private Node tail = null;

    // Method to add a node to the end of the circular linked list
    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Method to delete a node from the circular linked list
    public void deleteNode(int key) {
        if (head == null) {
            return;
        }

        Node current = head;
        Node previous = null;

        // Check if head node contains the key
        if (head.data == key) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }

        // Traverse the list to find the key
        do {
            previous = current;
            current = current.next;
        } while (current != head && current.data != key);

        // If the key is found, delete the node
        if (current.data == key) {
            previous.next = current.next;
            if (current == tail) {
                tail = previous;
            }
        }
    }

    // Method to display the nodes in the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        // Adding nodes
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);

        // Display the list
        System.out.println("Circular Linked List:");
        list.display();

        // Delete a node
        list.deleteNode(20);

        // Display the list again
        System.out.println("After deleting node with data 20:");
        list.display();
    }
}
