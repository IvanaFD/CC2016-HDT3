public class CocktailSort<T extends Comparable<T>> implements IGenereicSort<T> {
    @Override
    public T[] sort(T[] arr) {
        boolean swapped;
        int start = 0;
        int end = arr.length - 1;

        do {
            swapped = false;

            for (int i = start; i < end; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    swap(arr, i, i + 1);
                    swapped = true;
                }
            }
            end--;

            if (!swapped) break;

            swapped = false;

            for (int i = end; i > start; i--) {
                if (arr[i].compareTo(arr[i - 1]) < 0) {
                    swap(arr, i, i - 1);
                    swapped = true;
                }
            }
            start++;
        } while (swapped);

        return arr;
    }

    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

