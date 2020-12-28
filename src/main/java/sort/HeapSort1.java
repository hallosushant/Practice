package sort;

import java.util.Arrays;
import java.util.List;

//Java program for implementation of Heap Sort 
public class HeapSort1<T extends Comparable<T>> {

    private List<T> list;

    public HeapSort1(List<T> list) {
        this.list = list;
    }

    public void sort() {
        if (list == null)
            return;
        if (list.size() == 1)
            return;

        int n = list.size();

        for (int i = (n - 1) / 2; i >= 0; i--) {
            heapify(i, n);
        }

        for (int i = n - 1; i >= 0; i--) {
            int rooIndex = 0;
            T rootElement = list.get(rooIndex);

            list.set(0, list.get(i));
            list.set(i, rootElement);
            heapify(0, i);

        }
    }

    private void heapify(int i, int listSize) {
        int currIndex = i;
        int leftChildIndex = 2 * i + 1;
        int rightChildIndex = 2 * i + 2;
        if (leftChildIndex < listSize && list.get(currIndex).compareTo(list.get(leftChildIndex)) < 0)
            currIndex = leftChildIndex;
        if (rightChildIndex < listSize && list.get(currIndex).compareTo(list.get(rightChildIndex)) < 0)
            currIndex = rightChildIndex;

        if (currIndex != i) {
            T temp = list.get(i);
            list.set(i, list.get(currIndex));
            list.set(currIndex, temp);
            heapify(currIndex, listSize);
        }

    }

    public static void main(String[] args) {
        List<Integer> inputs = Arrays.asList(10, 11, 13, 5, 16, 17);

        HeapSort1<Integer> ob = new HeapSort1<>(inputs);
        ob.sort();

        System.out.println("Sorted list is = " + inputs);
    }
}
