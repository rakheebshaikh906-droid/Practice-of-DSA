package code;

import java.util.ArrayList;

public class MinHeap {

    private ArrayList<Integer> list;

    public MinHeap() {
        list = new ArrayList<>();
    }

    // Insert element
    public void insert(int value) {
        list.add(value);
        heapUp(list.size() - 1);
    }

    // Remove (extract min)
    public int remove() {
        if (list.isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }

        int removed = list.get(0);
        int last = list.remove(list.size() - 1);

        if (!list.isEmpty()) {
            list.set(0, last);
            heapDown(0);
        }

        return removed;
    }

    private void heapUp(int index) {
        if (index == 0) return;

        int parent = (index - 1) / 2;

        if (list.get(index) < list.get(parent)) {
            swap(index, parent);
            heapUp(parent);
        }
    }

    private void heapDown(int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int smallest = index;

        if (left < list.size() && list.get(left) < list.get(smallest)) {
            smallest = left;
        }

        if (right < list.size() && list.get(right) < list.get(smallest)) {
            smallest = right;
        }

        if (smallest != index) {
            swap(index, smallest);
            heapDown(smallest);
        }
    }

    private void swap(int first, int second) {
        int temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }
}