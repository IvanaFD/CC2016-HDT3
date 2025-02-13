import java.util.ArrayList;
import java.util.Collections;

class SortMethods<T extends Comparable<T>> implements IGenericSort<T> {

    @Override
    public void insertionSort(ArrayList<T> list) {
        
    }

    @Override
    public void mergeSort(ArrayList<T> list) {
        
    }

    @Override
    public void radixSort(ArrayList<T> list) {
        if (!(list.get(0) instanceof Integer)) {
            throw new UnsupportedOperationException("Radix Sort solo admite enteros.");
        }
        radixSortHelper((ArrayList<Integer>) list);
    }

    private void radixSortHelper(ArrayList<Integer> list) {
        int max = Collections.max(list);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(list, exp);
        }
    }

    private void countingSort(ArrayList<Integer> list, int exp) {
        int size = list.size();
        int[] output = new int[size];
        int[] count = new int[10];

        for (int i = 0; i < size; i++) {
            count[(list.get(i) / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = size - 1; i >= 0; i--) {
            int index = (list.get(i) / exp) % 10;
            output[count[index] - 1] = list.get(i);
            count[index]--;
        }

        for (int i = 0; i < size; i++) {
            list.set(i, output[i]);
        }
    }

    @Override
    public void cocktailSort(ArrayList<T> list) {
        boolean swapped;
        int start = 0, end = list.size() - 1;

        do {
            swapped = false;
            for (int i = start; i < end; i++) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    Collections.swap(list, i, i + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
            swapped = false;
            end--;

            for (int i = end - 1; i >= start; i--) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    Collections.swap(list, i, i + 1);
                    swapped = true;
                }
            }
            start++;
        } while (swapped);
    }
}



