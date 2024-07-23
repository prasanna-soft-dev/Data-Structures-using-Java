import java.util.*;

import org.w3c.dom.Node;
class SingleLinkedList{
    class ListNode{
        int data;
        ListNode next;
        ListNode(int val)
        {
            data=val;
            next=null;
        }
    }
    private ListNode head=null;
    public void addNode(int data)
    {
        ListNode newnode=new ListNode(data);
        if(head==null)
        {
            head=newnode;
        }
        else{
            ListNode current=head;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=newnode;
        }
    }
    public void deleteNode(int key)
    {
        if(head==null)
        {
            return;
        }
        if(head.data==key)
        {
            head.next=head;
        }
        ListNode current=head;
        ListNode previous=null;
        while(current!=null && current.data!=key)
        {
            previous=current;
            current=current.next;
        }
        if(current!=null)
        {
            previous.next=current.next;
        }
    }
    public Boolean isEmpty()
    {
        return head==null;
    }
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
        SingleLinkedList list = new SingleLinkedList();

        // Adding nodes
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);

        // Display the list
        System.out.println("Single Linked List:");
        list.display();

        // Delete a node
        list.deleteNode(20);

        // Display the list again
        System.out.println("After deleting node with data 20:");
        list.display();
    }
}