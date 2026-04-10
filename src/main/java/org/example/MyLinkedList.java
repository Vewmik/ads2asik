package org.example;

import java.util.Iterator;

public class MyLinkedList<T extends Comparable<T>> implements MyList<T> {
    private class Entry {
        T value;
        Entry next, prev;
        Entry(T value) { this.value = value; }
    }

    private Entry head, tail;
    private int length;

    @Override
    public void addLast(T item) {
        Entry newEntry = new Entry(item);
        if (tail == null) {
            head = tail = newEntry;
        } else {
            tail.next = newEntry;
            newEntry.prev = tail;
            tail = newEntry;
        }
        length++;
    }

    @Override
    public T get(int index) {
        Entry temp = head;
        for (int i = 0; i < index; i++) temp = temp.next;
        return temp.value;
    }

    @Override public int size() { return length; }
    @Override public T getFirst() { return (head != null) ? head.value : null; }
    @Override public void removeFirst() {
        if (head == null) return;
        head = head.next;
        if (head != null) head.prev = null;
        else tail = null;
        length--;
    }

    // Заглушки для остальных методов...
    @Override public void add(T item) { addLast(item); }
    @Override public void set(int index, T item) {}
    @Override public void add(int index, T item) {}
    @Override public void addFirst(T item) {}
    @Override public T getLast() { return null; }
    @Override public void remove(int index) {}
    @Override public void removeLast() {}
    @Override public void sort() {}
    @Override public int indexOf(Object o) { return -1; }
    @Override public int lastIndexOf(Object o) { return -1; }
    @Override public boolean exists(Object o) { return false; }
    @Override public Object[] toArray() { return null; }
    @Override public void clear() {}
    @Override public Iterator<T> iterator() { return null; }
}