public class InsertioSort<T extends Comparable<T>> implements IGenereicSort<T> {
    

    //referencia del insertion sort: https://www.w3schools.com/dsa/trydsa.php?filename=demo_insertionsort
    @Override
    public T[] sort(T[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            T Element = arr[i];
            int j = i -1;
            while (j >= 0 && arr[j].compareTo(Element) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = Element;
            }
            return arr;
        }
            
}

 