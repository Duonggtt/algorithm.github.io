import org.w3c.dom.Node;

import org.w3c.dom.Node;

class MyList {

    Node head;
    int length;


    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public MyList() {
        this.head = null;
        this.length = 0;
    }

    void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            if(temp.next == null) {
                System.out.println(temp.val);
            }else {
                System.out.print(temp.val + "-->");
            }
            temp = temp.next;
        }
    }

    public int get(int index) {
        if(index >= length) {
            return -1;
        }
        int count = 0;
        Node temp = head;
        int result = 0;
        while (count < index) {
            temp = temp.next;
            count++;
        }
        result = temp.val;
        return result;
    }

    public void addAtHead(int val) {
        Node new_node = new Node(val);
        new_node.next = head;
        head = new_node;
        length++;
    }

    public void addAtTail(int val) {
        if(head == null) {
            addAtHead(val);
        }else {
            Node new_node = new Node(val);
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
            length++;
        }
    }

    public void addAtIndex(int index, int val) {
        if(index > length) {
            return;
        }
        if(index == 0) {
            addAtHead(val);
        }else {
            Node new_node = new Node(val);
            int count = 1;
            Node temp = head;
            while (count < index) {
                temp = temp.next;
                count++;
            }
            new_node.next = temp.next;
            temp.next = new_node;
            length++;
        }

    }

    public void removeAtIndex(int index) {
        if(index >= length) {
            return;
        }
        if(index == 0) {
            head = head.next;
            length--;
        }else {
            Node temp = head;
            int count = 1;
            while(count < index) {
                count++;
                temp = temp.next;
            }
            temp.next = temp.next.next;
            length--;
        }
    }
}

public class LinkedList {

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.addAtHead(0);
        myList.addAtIndex(5,0);
        myList.addAtTail(9);
        myList.removeAtIndex(2);
        myList.printLinkedList();
    }

}

