package Queues;

import java.util.Queue;

public class QueueArray {
    private int[] arr;
    private int backOfQueue;
    private int nItems;
    int beginingOfQueue;

    public QueueArray (int size) {
        this.arr = new int[size];
        this.backOfQueue = -1;
        this.beginingOfQueue = -1;
        this.nItems = 0;
        System.out.println("The queue is successfully created with size of: " + size);
    }

    //isFull
    public boolean isFull(){
        if (backOfQueue == arr.length-1) {
            return true;
        } else  {
            return false;
        }
    }

    //Enqueue
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Queue is Full");
        } else if (isEmpty()) {
            beginingOfQueue = 0;
            backOfQueue++;
            arr[backOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        } else {
            backOfQueue++;
            nItems++;
            arr[backOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");

        }
    }
    //Dequeue
    public int deQueue () {
        if (isEmpty()){
            System.out.println("The Queue is empty");
            return -1;
        } else {
            int result = arr[beginingOfQueue];
            beginingOfQueue++;
            if (beginingOfQueue > backOfQueue) {
                beginingOfQueue = backOfQueue = -1;
            }
            nItems--;
            return result;
        }
    }
    //isEmpty
    public boolean isEmpty(){
        return (nItems == 0);
    }

    //Peek
    public int peek(){
        if (!isEmpty()){
            return arr[beginingOfQueue];
        } else {
            System.out.println("The Queue is empty");
            return -1;
        }
    }

    //delete
    public void deleteQueue(){
        arr = null;
        System.out.println("The Queue is successfully deleted");
    }
}
