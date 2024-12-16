package structures.stacks;

import structures.linkedlists.LinkedLIst;

public class Stack<T> {
    private final LinkedLIst<T> stack;

    public Stack() {
        stack = new LinkedLIst<>();
    }

    public void instack(T value) {
        stack.addHead(value);
    }

    public void pop() {
        stack.removeHead();
    }
}
