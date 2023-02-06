class myQeue {

    Node head;
    class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    myQeue(){
        head = null;
    }

    public void push(int val) {
        Node new_node = new Node(val);
        new_node.next = head;
        head = new_node;
    }

    int pop(){
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        int result = temp.next.val;
        temp.next = null;
        return result;
    }

    boolean isEmty() {
        if(head == null) {
            return true;
        }
        return false;
    }

    boolean isFull() {
        return false;
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
}

public class Queue {

    public static void main(String[] args) {
        myQeue queue = new myQeue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println("Emty ? " + queue.isEmty());
        System.out.println("Full ? " + queue.isFull());
        int n = queue.pop();
        System.out.println(n);
        queue.printLinkedList();
    }

}
