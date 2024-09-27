package LinkedList;

public class MainApp {
    public static void main(String[] args) {
        LinkedList sda = new LinkedList();
        sda.insertInLinkedList(1,0);
        sda.insertInLinkedList(2,1);
        sda.insertInLinkedList(3,2);
        sda.insertInLinkedList(4,3);
        sda.insertInLinkedList(5,4);
        sda.insertInLinkedList(6,5);

        System.out.println("Original Linked List:");
        sda.traverse();

        sda.search(4);
        sda.search(8); // 8 for failed search
        System.out.println(" ");

        System.out.println("Deleting head:");
        sda.delete(0); // Deletes the head (node with value 1)
        sda.traverse();
        System.out.println(" ");

        System.out.println("Deleting node at index 2:");
        sda.delete(2); // Deletes the node at index 2 (node with value 4)
        sda.traverse();
        System.out.println(" ");

        System.out.println("Deleting tail:");
        sda.delete(sda.size - 1); // Deletes the tail (node with value 6)
        sda.traverse();
    }
}
