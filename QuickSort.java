<<<<<<< HEAD
/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Sección 31
 * Hoja de Trabajo 3
 * Integrantes:
 * Diana Sosa 241040
 * Ivana Figueroa 24785
 * 
 * Clase QuickSort
 * Implementación del algoritmo QuickSort, un algoritmo de ordenamiento eficiente
 * basado en la estrategia de "divide y vencerás". El algoritmo selecciona un 
 * pivote y organiza los elementos en torno a él, realizando particiones recursivas
 * hasta obtener un arreglo ordenado.
 * 
 * Métodos:
 * - sort: Método principal que ordena el arreglo utilizando el algoritmo QuickSort.
 * - quickSort: Método recursivo que realiza la ordenación mediante particiones.
 * - partition: Método que organiza el arreglo en torno a un pivote y devuelve
 *   la posición del pivote.
 */
public class QuickSort<T extends Comparable<T>> implements IGenereicSort<T> {
=======
public class QuickSort<T extends Comparable<T>> implements IGenericSort<T> {
>>>>>>> 3df9a86cd76d5e34c42884c1dd76340929d61f0c

    /**
     * Ordena un arreglo utilizando el algoritmo QuickSort.
     * 
     * @param arr El arreglo que se desea ordenar.
     * @return El arreglo ordenado.
     */
    @Override
    public T[] sort(T[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    /**
     * Método recursivo que ordena el arreglo utilizando particiones.
     * 
     * @param arr El arreglo que se desea ordenar.
     * @param low El índice inicial del subarreglo.
     * @param high El índice final del subarreglo.
     */
    private void quickSort(T[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    /**
     * Realiza una partición del arreglo en torno a un pivote, organizando los
     * elementos de modo que los elementos menores que el pivote estén a la
     * izquierda y los mayores a la derecha.
     * 
     * @param arr El arreglo a particionar.
     * @param low El índice inicial del subarreglo.
     * @param high El índice final del subarreglo.
     * @return La posición del pivote después de la partición.
     */
    private int partition(T[] arr, int low, int high){
        T pivot = arr[high];
        int i = low -1;

        for (int j = low; j < high; j++){
            if(arr[j].compareTo(pivot) <= 0){
                i++;
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        T temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
