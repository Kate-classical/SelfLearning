package by.alexrom.s10;

public class MyLinkedList<T> {

    private static class Node<E> {
        E value;
        Node<E> next;
        Node<E> prev;

        public Node(E value) {
            this.value = value;
        }
    }

    Node<T> first;
    Node<T> last;
    int size;

    public T get(int i) {
        if(i < 0 || i > size) {
            throw new IndexOutOfBoundsException();
        }
        int count = 0;
        Node<T> current = first;
        while(count != i) {
            current = current.next;
            count++;
        }
        return current.value;
    }

    public void put(T e) {
        Node<T> node = new Node<>(e);
        if(size == 0) {
            first = last = node;
        } else {
            last.next = node;
            node.prev = last;

            last = node;
        }
        size++;
    }

    public void put(int i, T e) {
    }

    public void remove(int i) {
        int count = 0;
        Node<T> current = first;
        while(count!=i) {
            count++;
        }
        current = first.next;
    }

    public void remove(T e) {
    }

    public int length() {
        return size;
    }
}


