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
    public void traverse() {
        if (head == null) {
            System.out.println("Linked list does not exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i !=size -1 ){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("\n");
    }

    // Search for a list
    public boolean search(int nodeValue) {
        if (head != null){
            Node tempNode = head;
            for (int i = 0; i < size; i++){
                if (tempNode.value == nodeValue){
                    System.out.print(" Found the node: " + tempNode.value + " at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println(" Node not found");
        return false;
    }

    // Deleting a Node from a single list
    // 1. if link doesn't exist
    // 2. if deleting the head (beginning)
    // 3. if deleting at the tail (end)
    // 4. if deleting anywhere in the list
    public void delete(int location) {
        if (head == null) { // 1. If the linked list doesn't exist
            System.out.println("The linked list does not exist.");
            return;
        } else if (location == 0) { // 2. If deleting the head
            head = head.next;
            size--;
            if (size == 0) { // If the list becomes empty
                tail = null;
            }
        } else if (location >= size - 1) { // 3. If deleting the tail
            Node tempNode = head;
            for (int i = 0; i < size - 2; i++) {
                tempNode = tempNode.next; // Find the second-to-last node
            }
            if (tempNode == head) { // There's only one element
                head = tail = null;
                size = 0;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else { // 4. If deleting anywhere in the list
            Node tempNode = head;
            for (int i = 0; i < location -2; i++) {
                tempNode = tempNode.next; // Navigate to the node before the one to delete
            }
            Node nodeToDelete = tempNode.next;
            tempNode.next = nodeToDelete.next; // Bypass the node to delete
            size--;
        }
    }

}
