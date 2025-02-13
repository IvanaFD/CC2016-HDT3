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
        throw new UnsupportedOperationException("Radix Sort requiere valores numéricos y no puede usarse genéricamente.");
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



