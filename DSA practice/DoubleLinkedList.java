import java.util.*;

public class DoubleLinkedList{
    class ListNode{
        int data;
        ListNode next;
        ListNode prev;

        ListNode(int val)
        {
            data=val;
            next=null;
            prev=null;
        }
    }
    private ListNode head=null;
    private ListNode tail=null;

    public void addNode(int data)
    {
        ListNode newnode=new ListNode(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else
        {
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
    }
     // Method to delete a node from the double linked list
    public void deleteNode(int key) {
        if (head == null) {
            return;
        }

        if (head.data == key) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null; // If the list is now empty, reset the tail
            }
            return;
        }

        ListNode current = head;
        while (current != null && current.data != key) {
            current = current.next;
        }

        if (current != null) {
            if (current.next != null) {
                current.next.prev = current.prev;
            } else {
                tail = current.prev; // If deleting the tail node, update the tail
            }
            if (current.prev != null) {
                current.prev.next = current.next;
            }
        }
    }

    // Method to display the nodes in the double linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        // Adding nodes
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);

        // Display the list
        System.out.println("Double Linked List:");
        list.display();

        // Delete a node
        list.deleteNode(20);

        // Display the list again
        System.out.println("After deleting node with data 20:");
        list.display();
    }
}
