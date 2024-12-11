package linkedlists;

import java.util.Objects;

public class LinkedLIst<T> {
    private Node<T> head;

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
                tempNode = tempNode.next;
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
            Node<T> tempNode = head;
            while(tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
    }

    public void removeTail() {
        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {
                Node<T> temp = head;
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next = null;
            }
        }
    }

    public void removeHead() {
        if (head != null) {
            head = head.next;
        }
    }

    public class Node<T> {
        T value;
        Node<T> next;

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
