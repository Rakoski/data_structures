package structures.queue;

import structures.linkedlists.LinkedLIst;

public class Queue<T> {
    private final LinkedLIst<T> queue;

    public Queue() {
        queue = new LinkedLIst<>();
    }

    public void enqueue(T value) {
        queue.addHead(value);
    }

    public void dequeue() {
        queue.removeTail();
    }
}
