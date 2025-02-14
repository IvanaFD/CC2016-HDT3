import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Sección 31
 * Hoja de Trabajo 3
 * Integrantes:
 * Diana Sosa 241040
 * Ivana Figueroa 24785
 * 
 * Clase MergeSortTest
 * Conjunto de pruebas unitarias para el algoritmo MergeSort.
 * Verifica que el algoritmo de ordenamiento funcione correctamente con diferentes casos,
 * incluyendo arreglos con enteros, cadenas, arreglos vacíos, de un solo elemento, 
 * ya ordenados y con duplicados.
 * 
 * Métodos:
 * - testSortWithGenerics: Prueba de ordenamiento con enteros genéricos.
 * - testSortWithGenericsStrings: Prueba de ordenamiento con cadenas genéricas.
 * - testSortWithEmptyArray: Prueba con un arreglo vacío.
 * - testSortWithSingleElement: Prueba con un arreglo de un solo elemento.
 * - testSortAlreadySorted: Prueba con un arreglo ya ordenado.
 * - testSortWithDuplicates: Prueba con un arreglo que contiene duplicados.
 */
public class MergeSortTest {

    /**
     * Prueba de ordenamiento con enteros genéricos.
     */
    @Test
    public <T extends Comparable<T>> void testSortWithGenerics() {
        MergeSort<T> mergeSort = new MergeSort<>();
        
        T[] arr = (T[]) new Comparable[] {5, 3, 8, 4, 2, 7, 6, 1}; 
        T[] sortedArr = (T[]) new Comparable[] {1, 2, 3, 4, 5, 6, 7, 8};
        
        T[] result = mergeSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    /**
     * Prueba de ordenamiento con cadenas genéricas.
     */
    @Test
    public <T extends Comparable<T>> void testSortWithGenericsStrings() {
        MergeSort<T> mergeSort = new MergeSort<>();
        
        T[] arr = (T[]) new Comparable[] {"banana", "apple", "grape", "pear", "orange"};
        T[] sortedArr = (T[]) new Comparable[] {"apple", "banana", "grape", "orange", "pear"};
        
        T[] result = mergeSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    /**
     * Prueba con un arreglo vacío.
     */
    @Test
    public <T extends Comparable<T>> void testSortWithEmptyArray() {
        MergeSort<T> mergeSort = new MergeSort<>();
        
        T[] arr = (T[]) new Comparable[] {};
        T[] sortedArr = (T[]) new Comparable[] {};
        
        T[] result = mergeSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    /**
     * Prueba con un arreglo de un solo elemento.
     */
    @Test
    public <T extends Comparable<T>> void testSortWithSingleElement() {
        MergeSort<T> mergeSort = new MergeSort<>();
        
        T[] arr = (T[]) new Comparable[] {42};
        T[] sortedArr = (T[]) new Comparable[] {42};
        
        T[] result = mergeSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    /**
     * Prueba con un arreglo ya ordenado.
     */
    @Test
    public <T extends Comparable<T>> void testSortAlreadySorted() {
        MergeSort<T> mergeSort = new MergeSort<>();
        
        T[] arr = (T[]) new Comparable[] {1, 2, 3, 4, 5};
        T[] sortedArr = (T[]) new Comparable[] {1, 2, 3, 4, 5};
        
        T[] result = mergeSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    /**
     * Prueba con un arreglo que contiene duplicados.
     */
    @Test
    public <T extends Comparable<T>> void testSortWithDuplicates() {
        MergeSort<T> mergeSort = new MergeSort<>();
        
        T[] arr = (T[]) new Comparable[] {5, 1, 3, 3, 4, 5, 2};
        T[] sortedArr = (T[]) new Comparable[] {1, 2, 3, 3, 4, 5, 5};
        
        T[] result = mergeSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }
}

