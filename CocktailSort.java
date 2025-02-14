/**
 * Implementación del algoritmo de ordenamiento Cocktail Sort, también conocido como
 * Bidirectional Bubble Sort. Este algoritmo mejora el Bubble Sort clásico al recorrer
 * el arreglo en ambas direcciones: de izquierda a derecha y de derecha a izquierda.
 * 
 * <p>Este algoritmo es útil cuando se tiene un conjunto de datos pequeño a mediano y
 * proporciona una mejora en el rendimiento al reducir el número de iteraciones necesarias.
 *
 * @param <T> Tipo genérico que debe implementar la interfaz {@link Comparable} para
 *            permitir la comparación entre elementos del arreglo.
 */
public class CocktailSort<T extends Comparable<T>> implements IGenereicSort<T> {

    /**
     * Ordena un arreglo utilizando el algoritmo Cocktail Sort. El arreglo se ordena
     * en orden ascendente, intercambiando elementos adyacentes si están en el orden incorrecto.
     * El proceso continúa hasta que no se realicen más intercambios durante una pasada completa.
     *
     * @param arr El arreglo a ordenar.
     * @return El arreglo ordenado.
     */
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
