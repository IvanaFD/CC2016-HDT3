import java.util.Arrays;

// referencia del merge sort: https://www.w3schools.com/dsa/trydsa.php?filename=demo_mergesort
public class MergeSort<T extends Comparable<T>> implements IGenericSort<T>{

    /**
     * Ordena un arreglo utilizando el algoritmo Merge Sort.
     * 
     * @param arr El arreglo a ordenar.
     * @return El arreglo ordenado.
     */
    @Override
    public T[] sort(T[] arr) {
        // Caso base: Si el arreglo tiene 1 o menos elementos, ya está ordenado.
        if (arr.length <= 1)  return arr;

        // Dividir el arreglo en dos mitades.
        int mid = arr.length / 2;
        T[] leftHalf = Arrays.copyOfRange(arr, 0, mid);
        T[] rightHalf = Arrays.copyOfRange(arr, mid, arr.length);

        // Llamadas recursivas para ordenar las dos mitades.
        leftHalf = sort(leftHalf);
        rightHalf = sort(rightHalf);

        // Fusionar las dos mitades ordenadas.
        return merge(leftHalf, rightHalf);
    }

    /**
     * Fusiona dos subarreglos ordenados en uno solo.
     * 
     * @param left El primer subarreglo ordenado.
     * @param right El segundo subarreglo ordenado.
     * @return El arreglo resultante de la fusión de los dos subarreglos ordenados.
     */
    public T[] merge(T[] left, T[] right) {
        // Crear un arreglo para almacenar el resultado fusionado.
        T[] result = Arrays.copyOf(left, left.length + right.length);
        int i = 0, j = 0, k = 0;

        // Fusionar los elementos de los subarreglos de forma ordenada.
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        // Agregar los elementos restantes del subarreglo izquierdo (si hay).
        while (i < left.length) {
            result[k++] = left[i++];
        }

        // Agregar los elementos restantes del subarreglo derecho (si hay).
        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}

    
