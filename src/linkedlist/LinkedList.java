package linkedlist;

import java.util.Iterator;

public class LinkedList<T> implements Interator<T> {
    private Node<T> head;

    private int size = 0;
    public void add(T elem) {
        Node<T> newNode = new Node<>();
        newNode.value = elem;
        newNode.next = head;
        newNode.previous = null;

        if (head != null) {
            head.previous = newNode;
        }
        head = newNode;
        size++;
    }

    @Override
    public void remove(int index) {
        if (isOutOfBounds(index)) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size());
        }
        if (index == 0) {
            head = head.next;
            head.previous = null;
        } else {
            Node<T> current = head;
            for (int i = 0; i != index; i++) {
                current = current.next;
            }
            if (current.next != null)
                current.next.previous = current.previous;
            current.previous.next = current.next;
        }
        size--;
    }

    public T get(int index) {
        if (isOutOfBounds(index)) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    @Override
    public int size() {
        return size;
    }

    public Iterator<T> iterator() {
        return null;
    }

    private boolean isOutOfBounds(int index) {
        return index < 0 || index >= size();
    }
}

