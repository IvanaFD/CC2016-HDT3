import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la implementación del algoritmo de ordenamiento Radix Sort.
 */
class RadixSortTest {

    /**
     * Prueba el ordenamiento de números enteros positivos.
     */
    @Test
    void testSortIntegers() {
        RadixSort<Integer> sorter = new RadixSort<>();
        Integer[] input = {170, 45, 75, 90, 802, 24, 2, 66};
        Integer[] expected = {2, 24, 45, 66, 75, 90, 170, 802};
        assertArrayEquals(expected, sorter.sort(input));
    }

    /**
     * Prueba el ordenamiento de cadenas de texto numéricas.
     */
    @Test
    void testSortStrings() {
        RadixSort<String> sorter = new RadixSort<>();
        String[] input = {"170", "45", "75", "90", "802", "24", "2", "66"};
        String[] expected = {"2", "24", "45", "66", "75", "90", "170", "802"};
        assertArrayEquals(expected, sorter.sort(input));
    }

    /**
     * Prueba el ordenamiento de un arreglo que ya está ordenado.
     */
    @Test
    void testSortAlreadySorted() {
        RadixSort<Integer> sorter = new RadixSort<>();
        Integer[] input = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, sorter.sort(input));
    }

    /**
     * Prueba el ordenamiento de un arreglo en orden inverso.
     */
    @Test
    void testSortReverseOrder() {
        RadixSort<Integer> sorter = new RadixSort<>();
        Integer[] input = {9, 7, 5, 3, 1};
        Integer[] expected = {1, 3, 5, 7, 9};
        assertArrayEquals(expected, sorter.sort(input));
    }

    /**
     * Prueba el ordenamiento de un arreglo con un solo elemento.
     */
    @Test
    void testSortSingleElement() {
        RadixSort<Integer> sorter = new RadixSort<>();
        Integer[] input = {42};
        Integer[] expected = {42};
        assertArrayEquals(expected, sorter.sort(input));
    }

    /**
     * Prueba el ordenamiento de un arreglo vacío.
     */
    @Test
    void testSortEmptyArray() {
        RadixSort<Integer> sorter = new RadixSort<>();
        Integer[] input = {};
        Integer[] expected = {};
        assertArrayEquals(expected, sorter.sort(input));
    }

    /**
     * Prueba el ordenamiento de un arreglo con valores duplicados.
     */
    @Test
    void testSortWithDuplicates() {
        RadixSort<Integer> sorter = new RadixSort<>();
        Integer[] input = {4, 2, 2, 4, 3};
        Integer[] expected = {2, 2, 3, 4, 4};
        assertArrayEquals(expected, sorter.sort(input));
    }
}


