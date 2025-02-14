import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Sección 31
 * Hoja de Trabajo 3
 * 
 * Pruebas unitarias para la implementación de la interfaz IGenericSort.
 * Se realizan pruebas utilizando una implementación concreta de la interfaz.
 */
class IGenericSortTest {

    /**
     * Implementación de prueba de IGenericSort usando Bubble Sort.
     * Se usa para verificar el correcto funcionamiento de la interfaz.
     */
    private static class BubbleSort<T extends Comparable<T>> implements IGenericSort<T> {
        @Override
        public T[] sort(T[] arr) {
            int n = arr.length;
            T[] sortedArr = arr.clone();
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (sortedArr[j].compareTo(sortedArr[j + 1]) > 0) {
                        T temp = sortedArr[j];
                        sortedArr[j] = sortedArr[j + 1];
                        sortedArr[j + 1] = temp;
                    }
                }
            }
            return sortedArr;
        }
    }

    /**
     * Prueba el ordenamiento de un arreglo de enteros representados como String.
     * Se espera que los elementos sean ordenados correctamente.
     */
    @Test
    void testSortStrings() {
        IGenericSort<String> sorter = new BubbleSort<>();
        String[] input = {"5", "3", "8", "1"};
        String[] expected = {"1", "3", "5", "8"};
        assertArrayEquals(expected, sorter.sort(input));
    }

    /**
     * Prueba el ordenamiento de un arreglo de objetos MyComparable.
     * Se espera que los objetos sean ordenados correctamente.
     */
    @Test
    void testSortMyComparable() {
        IGenericSort<MyComparable> sorter = new BubbleSort<>();
        MyComparable[] input = {new MyComparable(3), new MyComparable(1), new MyComparable(2)};
        MyComparable[] expected = {new MyComparable(1), new MyComparable(2), new MyComparable(3)};
        assertArrayEquals(expected, sorter.sort(input));
    }

    /**
     * Prueba el ordenamiento de un arreglo ya ordenado.
     * Se espera que el resultado sea idéntico al arreglo original.
     */
    @Test
    void testSortAlreadySorted() {
        IGenericSort<String> sorter = new BubbleSort<>();
        String[] input = {"1", "2", "3", "4"};
        String[] expected = {"1", "2", "3", "4"};
        assertArrayEquals(expected, sorter.sort(input));
    }

    /**
     * Prueba el ordenamiento de un arreglo con un solo elemento.
     * Se espera que el resultado sea el mismo que el de entrada.
     */
    @Test
    void testSortSingleElement() {
        IGenericSort<String> sorter = new BubbleSort<>();
        String[] input = {"42"};
        String[] expected = {"42"};
        assertArrayEquals(expected, sorter.sort(input));
    }

    /**
     * Prueba el ordenamiento de un arreglo vacío.
     * Se espera que el resultado también sea un arreglo vacío.
     */
    @Test
    void testSortEmptyArray() {
        IGenericSort<String> sorter = new BubbleSort<>();
        String[] input = {};
        String[] expected = {};
        assertArrayEquals(expected, sorter.sort(input));
    }

    /**
     * Prueba el ordenamiento de un arreglo con valores duplicados.
     * Se espera que los valores duplicados sean ordenados correctamente.
     */
    @Test
    void testSortWithDuplicates() {
        IGenericSort<String> sorter = new BubbleSort<>();
        String[] input = {"3", "1", "3", "2", "1"};
        String[] expected = {"1", "1", "2", "3", "3"};
        assertArrayEquals(expected, sorter.sort(input));
    }
}
