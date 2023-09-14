package KI304.Stefaniv.Lab6;
import java.util.EmptyStackException;

/**
 * A generic stack data structure implementation.
 *
 * @param <T> The type of elements stored in the stack.
 */
public class Stack<T extends Comparable<T>> {
    private Node<T> top;
    private int size;

    /**
     * Constructs an empty stack.
     */
    public Stack() {
        top = null;
        size = 0;
    }

    /**
     * Pushes an element onto the top of the stack.
     *
     * @param data The element to be pushed onto the stack.
     */
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    /**
     * Pops the top element from the stack and returns it.
     *
     * @return The top element of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    /**
     * Returns the top element of the stack without removing it.
     *
     * @return The top element of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns the number of elements in the stack.
     *
     * @return The number of elements in the stack.
     */
    public int size() {
        return size;
    }

    /**
     * Returns the minimum element in the stack by iterating through the stack.
     *
     * @return The minimum element in the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    
    public T getMin() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        Node<T> current = top;
        T minElement = current.data;

        while (current != null) {
            if (current.data.compareTo(minElement) < 0) {
                minElement = current.data;
            }
            current = current.next;
        }

        return minElement;
    }

    /**
     * A private inner class representing a node in the stack.
     *
     * @param <T> The type of data stored in the node.
     */
    private static class Node<T> {
        private final T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}


