package uz.pdp.uenter.queue;

import java.util.LinkedList;

public class Queue {
    private Integer maxQueueSize;
    private Integer count;
    private Integer queueFront;
    private Integer queueRear;
    private LinkedList<Integer> queueList;

    public Queue(int queueSize) {
        if (queueSize <= 0) {
            System.out.println("Size of the array to hold the queue must be positive.");
            System.out.println("Creating an array of size 100");
            maxQueueSize = 100;
        } else {
            maxQueueSize = queueSize;
        }
        this.queueList = new LinkedList<>();
        this.count = 0;
        this.queueFront = 0;
        this.queueRear = -1;
    }


    public void enqueue(int element) {
        if (count < maxQueueSize) {
            queueList.add(element);
            queueRear = (queueRear + 1) % maxQueueSize;
            count++;
        } else {
            System.out.println("Queue is full.");
        }
    }

    public Integer dequeue() {
        if (count > 0) {
            Integer element = queueList.removeFirst();
            queueFront = (queueFront + 1) % maxQueueSize;
            count--;
            return element;
        } else {
            System.out.println("Queue is empty.");
            return null;
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == maxQueueSize;
    }
}
