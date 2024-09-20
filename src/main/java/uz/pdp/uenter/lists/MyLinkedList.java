package uz.pdp.uenter.lists;

public class MyLinkedList<T> {
    Node<T> head;

    MyLinkedList() {
        this.head = null;
    }

    void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    void remove(T data) {
        if (head == null) {
            return;
        }

        if (head.data.equals(data)) {
            head = head.next;
            return;
        }
        Node<T> current = head;
        Node<T> previous = null;


        while (current != null && !current.data.equals(data)) {
            previous = current;
            current = current.next;
        }

        if (current != null) {
            previous.next = current.next;
        }
    }


    void getDelete(T data){
        if (head==null){
            return;
        }
        if ()
    }



    void getMax() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        T max = head.data;
        Node<T> current = head.next;

        while (current != null) {
            if ((Integer) current.data > (Integer) max) {
                max = current.data;
            }
            current = current.next;
        }

        System.out.println(max);
    }


    class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        MyLinkedList<Integer> intList = new MyLinkedList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        intList.getMax();

        System.out.println("Original list:");
        intList.display();
        intList.remove(3);
        System.out.println("After removing 3:");
        intList.display();

        intList.remove(1);
        System.out.println("After removing 1:");
        intList.display();

    }
}
