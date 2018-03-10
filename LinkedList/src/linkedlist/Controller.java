package linkedlist;

public class Controller {
    public void controlLinkedList(){
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(12);
        list.insert(15);
        list.insert(20);
        list.insert(25);
        list.insert(10);

        list.insertFront(5);
        list.insertFront(2);

        list.display();

        list.deleteWithValue(10);
        list.display();

        list.insertAtIndex(2, 50);
        list.display();

        list.deleteAtIndex(3);
        list.display();
    }
}
