package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("--- Starting Data Structures Validation ---\n");

        // 1. Тест динамического массива (Insertion Sort)
        System.out.println("[1] Testing MyArrayList (Insertion Sort)");
        MyArrayList<Double> prices = new MyArrayList<>();
        prices.add(99.9);
        prices.add(15.5);
        prices.add(45.0);
        System.out.println("Count: " + prices.size());
        prices.sort();
        System.out.println("Sorted (min): " + prices.get(0)); // Должно быть 15.5
        System.out.println();

        // 2. Тест связного списка (Entry-based)
        System.out.println("[2] Testing MyLinkedList");
        MyLinkedList<String> names = new MyLinkedList<>();
        names.addLast("Alice");
        names.addLast("Bob");
        System.out.println("Header value: " + names.getFirst());
        names.removeFirst();
        System.out.println("New header value: " + names.getFirst()); // Должно быть Bob
        System.out.println();

        // 3. Тест стека (CustomStack)
        System.out.println("[3] Testing CustomStack (LIFO)");
        CustomStack<Integer> history = new CustomStack<>();
        history.push(101);
        history.push(102);
        history.push(103);
        System.out.println("Removed from top: " + history.pop()); // Должно быть 103
        System.out.println();

        // 4. Тест очереди (CustomQueue)
        System.out.println("[4] Testing CustomQueue (FIFO)");
        CustomQueue<String> tasks = new CustomQueue<>();
        tasks.enqueue("Format PC");
        tasks.enqueue("Install Java");
        System.out.println("Processing: " + tasks.dequeue()); // Должно быть Format PC
        System.out.println();

        // 5. Тест кучи (MinHeap)
        System.out.println("[5] Testing MinHeap");
        MinHeap<Integer> priorityItems = new MinHeap<>();
        priorityItems.insert(70);
        priorityItems.insert(20);
        priorityItems.insert(40);
        System.out.println("Heap operation completed.");

        System.out.println("\n--- All modules are operational ---");
    }
}