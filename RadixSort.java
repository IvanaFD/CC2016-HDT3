import java.util.*;

/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Sección 31
 * Hoja de Trabajo 3
 * 
 * Implementación del algoritmo de ordenamiento Radix Sort utilizando tipos genéricos.
 * Este algoritmo clasifica elementos en función de sus representaciones en cadena, 
 * ordenándolos por sus caracteres de derecha a izquierda.
 * 
 * @param <T> Tipo genérico que extiende Comparable<T>
 */
public class RadixSort<T extends Comparable<T>> implements IGenereicSort<T> {

    /**
     * Ordena un arreglo utilizando el algoritmo Radix Sort.
     * El algoritmo convierte los elementos a cadenas y los ordena basándose en sus caracteres.
     *
     * @param arr El arreglo de elementos genéricos a ordenar.
     * @return Un nuevo arreglo ordenado.
     */
    @Override
    public T[] sort(T[] arr) {
        if (arr.length == 0) return arr;

        int maxDigits = getMaxDigits(arr);

        for (int exp = 0; exp < maxDigits; exp++) {
            arr = countingSortByDigit(arr, exp);
        }

        return arr;
    }

    /**
     * Obtiene la longitud máxima en caracteres de los elementos en el arreglo.
     *
     * @param arr El arreglo de elementos genéricos.
     * @return La cantidad máxima de caracteres en los elementos del arreglo.
     */
    private int getMaxDigits(T[] arr) {
        int maxDigits = 0;
        for (T item : arr) {
            String str = item.toString();
            maxDigits = Math.max(maxDigits, str.length());
        }
        return maxDigits;
    }

    /**
     * Ordena los elementos según un dígito específico de derecha a izquierda.
     *
     * @param arr El arreglo de elementos genéricos a ordenar.
     * @param digitIndex El índice del dígito que se está ordenando.
     * @return Un nuevo arreglo ordenado por el dígito especificado.
     */
    private T[] countingSortByDigit(T[] arr, int digitIndex) {
        Map<Character, Queue<T>> buckets = new HashMap<>();
        for (char c = '0'; c <= '9'; c++) {
            buckets.put(c, new LinkedList<>());
        }

        for (T item : arr) {
            String str = item.toString();
            char digit = (digitIndex < str.length()) ? str.charAt(str.length() - 1 - digitIndex) : '0';
            buckets.get(digit).offer(item);
        }

        List<T> sortedList = new ArrayList<>();
        for (char c = '0'; c <= '9'; c++) {
            sortedList.addAll(buckets.get(c));
        }

        return sortedList.toArray(arr);
    }
}

