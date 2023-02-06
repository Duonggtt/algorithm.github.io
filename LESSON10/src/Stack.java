class QueueArray {
    int[] qArr = new int[10];
    int top;
    int bottom;
    int length;
    QueueArray() {
        top = -1;
        bottom = 0;
        length = 0;
    }

    void push(int val) {
        if(!isFull()) {
            if(top == qArr.length - 1) {
                top = 0;
            }
            if(top < qArr.length - 1) {
                top++;
            }
            qArr[top] = val;
            length++;
        }
    }

    int pop() {
        int temp = 0;
        if(!isEmty()) {
            temp = qArr[bottom];
            if(bottom == qArr.length-1) {
                bottom = 0;
            }
            if(bottom < qArr.length-1) {
                bottom++;
            }
            length--;
        }
        return temp;
    }

    boolean isFull() {
        if(length == qArr.length) {
            return true;
        }
        return false;
    }

    boolean isEmty() {
        if(length == 0) {
            return true;
        }
        return false;
    }

    void printArray() {
        for(int i =0;i<qArr.length;i++ ) {
            if(qArr[i] == -1) {
                System.out.println("none :V");
            }else {
                System.out.print(qArr[i] + " ");
            }
        }
    }
}

class stackArray {
    int[] arr = new int[10];
    int top;
    stackArray() {
        top = -1;
    }

    void push(int val) {
        if(!isFull()) {
            top++;
            arr[top] = val;
        }
    }

    int pop() {
        if(!isEmty()) {
            int temp = arr[top];
            top--;
            return temp;
        }
        return -1;
    }

    boolean isFull() {
        if(top == arr.length - 1) {
            return true;
        }
        return false;
    }

    boolean isEmty() {
        if(top == -1) {
            return true;
        }
        return false;
    }

    void printArray() {
        for(int i =0;i<arr.length;i++ ) {
            if(arr[i] == -1) {
                System.out.println("none :V");
            }else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}


class myStack {

    Node head;
    class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    myStack(){
        head = null;
    }

    public void push(int val) {
        Node new_node = new Node(val);
        new_node.next = head;
        head = new_node;
    }

    int pop(){
        int temp = head.val;
        head = head.next;
        return temp;
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
        myStack.Node temp = head;
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




public class Stack {

    public static void main(String[] args) {
        myStack stack = new myStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Emty ? " + stack.isEmty());
        System.out.println("Full ? " + stack.isFull());
        int n = stack.pop();
        System.out.println(n);
        stack.printLinkedList();

        System.out.println("============================");
        stackArray stackArr = new stackArray();
        stackArr.push(1);
        stackArr.push(2);
        stackArr.push(3);
        stackArr.push(4);
        stackArr.push(5);
        stackArr.push(6);
        stackArr.push(7);
        stackArr.push(8);
        stackArr.push(9);
        stackArr.push(10);
        System.out.println("Emty ? " + stackArr.isEmty());
        System.out.println("Full ? " + stackArr.isFull());
        int m = stackArr.pop();
        System.out.println(m);
        stackArr.printArray();

        System.out.println("\n============================");
        QueueArray queueArray = new QueueArray();
        queueArray.push(1);
        queueArray.push(2);
        queueArray.push(3);
        queueArray.push(4);
        queueArray.push(5);
        queueArray.push(6);
        queueArray.push(7);
        queueArray.push(8);
        queueArray.push(9);
        queueArray.push(10);
        System.out.println("Emty ? " + queueArray.isEmty());
        System.out.println("Full ? " + queueArray.isFull());
        int k = stackArr.pop();
        System.out.println(k);
        queueArray.printArray();
    }

}
