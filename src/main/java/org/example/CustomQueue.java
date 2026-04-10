package org.example;


public class CustomQueue<T extends Comparable<T>> {
    private MyLinkedList<T> internal = new MyLinkedList<>();
    public void enqueue(T val) { internal.addLast(val); }
    public T dequeue() {
        T val = internal.getFirst();
        internal.removeFirst();
        return val;
    }
}