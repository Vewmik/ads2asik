package org.example;
import java.util.Iterator;

public class MyArrayList<T extends Comparable<T>> implements MyList<T> {
    private Object[] buffer;
    private int count;

    public MyArrayList() {
        this.buffer = new Object[5]; // Маленький начальный размер
        this.count = 0;
    }

    @Override
    public void add(T item) {
        if (count == buffer.length) {
            grow();
        }
        buffer[count++] = item;
    }

    private void grow() {
        Object[] newBuffer = new Object[buffer.length + (buffer.length / 2) + 1];
        System.arraycopy(buffer, 0, newBuffer, 0, count);
        buffer = newBuffer;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= count) throw new IndexOutOfBoundsException();
        return (T) buffer[index];
    }

    @Override
    public void sort() {
        // Сортировка вставками (Insertion Sort) — другой алгоритм
        for (int i = 1; i < count; i++) {
            T key = (T) buffer[i];
            int j = i - 1;
            while (j >= 0 && ((T) buffer[j]).compareTo(key) > 0) {
                buffer[j + 1] = buffer[j];
                j--;
            }
            buffer[j + 1] = key;
        }
    }

    @Override public int size() { return count; }
    @Override public void clear() { count = 0; buffer = new Object[5]; }
    @Override public void set(int index, T item) { buffer[index] = item; }
    @Override public void add(int index, T item) { /* реализация */ }
    @Override public void addFirst(T item) { add(0, item); }
    @Override public void addLast(T item) { add(item); }
    @Override public T getFirst() { return get(0); }
    @Override public T getLast() { return get(count - 1); }
    @Override public void remove(int index) { /* реализация */ }
    @Override public void removeFirst() { remove(0); }
    @Override public void removeLast() { remove(count - 1); }
    @Override public int indexOf(Object o) { return -1; }
    @Override public int lastIndexOf(Object o) { return -1; }
    @Override public boolean exists(Object o) { return false; }
    @Override public Object[] toArray() { return new Object[0]; }
    @Override public Iterator<T> iterator() { return null; }
}