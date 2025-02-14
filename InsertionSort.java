/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Sección 31
 * Hoja de Trabajo 3
 * Integrantes:
 * Diana Sosa 241040
 * Ivana Figueroa 24785
 * 
 * Clase InsertionSort
 * Implementa el algoritmo de ordenamiento por inserción para un arreglo de objetos
 * que implementan la interfaz Comparable.
 * 
 * El algoritmo recorre el arreglo y coloca cada elemento en su posición correcta
 * en una parte previamente ordenada del arreglo.
 * 
 * Parámetros:
 * T - Tipo de objeto que debe ser comparable (debe extender Comparable<T>).
 * 
 * Métodos:
 * - sort: Implementa el algoritmo de ordenamiento por inserción sobre el arreglo dado.
 */
public class InsertionSort<T extends Comparable<T>> implements IGenericSort<T> {

    /**
     * Ordena un arreglo de objetos del tipo T usando el algoritmo de ordenamiento por inserción.
     * 
     * @param arr Arreglo de objetos a ordenar.
     * @return Un nuevo arreglo de objetos ordenados.
     */
    @Override
    public T[] sort(T[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            T element = arr[i];
            int j = i - 1;
            // Desplazamiento de elementos mayores a la derecha
            while (j >= 0 && arr[j].compareTo(element) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = element;  // Coloca el elemento en su posición correcta
        }
        return arr;
    }
}


 