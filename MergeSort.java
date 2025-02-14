import java.util.Arrays;

// referencia del merge sort: https://www.w3schools.com/dsa/trydsa.php?filename=demo_mergesort
public class MergeSort<T extends Comparable<T>> implements IGenericSort<T>{

    @Override
    public T[] sort(T[] arr) {
        if (arr.length <= 1)  return arr;
        

        int mid = arr.length / 2;
        T[] leftHalf = Arrays.copyOfRange(arr, 0, mid);
        T[] rightHalf = Arrays.copyOfRange(arr, mid, arr.length);

        leftHalf = sort(leftHalf);
        rightHalf = sort(rightHalf);

        return merge(leftHalf, rightHalf);
    }

    public  T[] merge(T[] left, T[] right) {
        T[] result = Arrays.copyOf(left , left.length + right.length);
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left [i].compareTo(right[j]) <= 0) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}
    
