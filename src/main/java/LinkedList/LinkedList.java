package LinkedList;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Create a linked list
    public Node createLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insert into a linked list
        // 0. If linked list doesn't exist then create it
        // 1. Insert at the beginning
        // 2. Inserting at the ending
        // 3. Insert anywhere in the Linked list

    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if (head == null){
            createLinkedList(nodeValue);
            return;
        }else if (location == 0) {
            node.next = head;
            head = node;
        }else if (location >= size) {
            tail.next = node;
            node.next = node;
            tail = node;
        }else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
               tempNode = tempNode.next;
               index++;
            }
            Node nextNode = node;
            node.next = nextNode;
        }
        size++;
    }
    // Traverse a linked list
    // Search for a list
}
