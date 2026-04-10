package org.example;


public class CustomStack<T extends Comparable<T>> {
    private MyLinkedList<T> storage = new MyLinkedList<>();
    public void push(T val) { storage.addLast(val); } // используем конец списка как вершину
    public T pop() {
        T val = storage.get(storage.size() - 1);
        storage.removeLast();
        return val;
    }
}