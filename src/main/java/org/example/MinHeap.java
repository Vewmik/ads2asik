package org.example;

public class MinHeap<T extends Comparable<T>> {
    private MyArrayList<T> data = new MyArrayList<>();
    public void insert(T val) {
        data.add(val);
        // логика siftUp
    }
}