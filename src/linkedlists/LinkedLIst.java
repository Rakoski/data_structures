package linkedlists;

import java.util.Objects;

public class LinkedLIst<T> {
    private Node<T> head;
    private Node<T> tail;
    // arrays are stored together in memory
    // linked lists (nodes) are stored separately in memory
    // O (n)

    public void addHead(T value) {
        Node<T> node = new Node<>(value);
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    public void addAfterValue(T value, T referenceValue) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> tempNode = head;
            while (tempNode.next != null && !Objects.equals(tempNode.value, referenceValue)) {
                tempNode = (Node<T>) tempNode.next;
            }
            newNode.next = tempNode.next;
            tempNode.next = newNode;
        }
    }

    public void addTail(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void removeTail() {
        if (head == null) return;
        if (head == tail) {
            tail = null;
            head = null;
            return;
        }

        Node<T> temp = head;
        while (temp.next != tail) {
            temp = (Node<T>) temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    public void removeHead() {
        if (head != null) {
            head = (Node<T>) head.next;
        }
    }

    public static class Node<T> {
        T value;
        public Node<?> next;

        public Node(T value) {
            this.value = value;
            next = null;
        }
    }

    public T getHead() {
        return head != null ? head.value : null;
    }

    public boolean isEmpty() {
        return head == null;
    }

}
