package linkedlist;

public class LinkedList {

    Node head;

    public void insert(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void insertFront(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void insertAtIndex(int index, int data) {
        Node node = new Node(data);

        if (index == 0) {
            this.insertFront(data);
        } else {

            Node current = head;
            for (int i = 0; i < (index - 1); i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
    }

    public void deleteWithValue(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    
    public void deleteAtIndex(int index){
        if(index == 0){
            head = head.next;
        }else{
            Node current = head;
            Node temp = null;
            for (int i = 0; i < (index - 1); i++) {
                current = current.next;
            }
            temp = current.next;
            current.next = temp.next;
            temp = null;
        }
    }

    public void display() {
        Node current = head;
        System.out.println("\nThe linked list is :");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

}
