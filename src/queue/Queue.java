package queue;

import linkedlists.LinkedLIst;

public class Queue<T> {
    private final LinkedLIst<T> queue;

    public Queue() {
        queue = new LinkedLIst<>();
    }

    public void enqueue(T value) {
        queue.addHead(value);
    }

    public void unqueue() {
        queue.removeTail();
    }
}
