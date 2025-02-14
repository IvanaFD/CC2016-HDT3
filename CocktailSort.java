/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Sección 31
 * Hoja de Trabajo 3
 * Integrantes:
 * Diana Sosa 241040
 * Ivana Figueroa 24785
 * 

 */
public class CocktailSort<T extends Comparable<T>> implements IGenericSort<T> {
    @Override
    public T[] sort(T[] arr) {
        boolean swapped;
        int start = 0;
        int end = arr.length - 1;

        do {
            swapped = false;

            // Recorrido de izquierda a derecha
            for (int i = start; i < end; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    swap(arr, i, i + 1);
                    swapped = true;
                }
            }
            end--;

            if (!swapped) break;

            swapped = false;

            // Recorrido de derecha a izquierda
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

    /**
     * Intercambia dos elementos en el arreglo.
     *
     * @param arr El arreglo donde se realizarán los intercambios.
     * @param i El índice del primer elemento a intercambiar.
     * @param j El índice del segundo elemento a intercambiar.
     */
    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
