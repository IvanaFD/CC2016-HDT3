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
 * Clase InsertioSortTest
 * Clase de prueba para el algoritmo de ordenamiento por inserción (InsertioSort).
 * Se verifican varios casos de prueba utilizando JUnit 5.
 * 
 * Métodos de prueba:
 * - testSortWithGenerics: Verifica que el algoritmo funcione correctamente con un arreglo de enteros.
 * - testSortWithGenericsStrings: Verifica que el algoritmo funcione correctamente con un arreglo de cadenas de texto.
 * - testSortWithEmptyArray: Verifica el comportamiento del algoritmo con un arreglo vacío.
 * - testSortWithSingleElement: Verifica el comportamiento del algoritmo con un arreglo que contiene un solo elemento.
 * - testSortAlreadySorted: Verifica que el algoritmo no altere un arreglo que ya está ordenado.
 * - testSortWithDuplicates: Verifica que el algoritmo maneje correctamente los arreglos con elementos duplicados.
 */
public class InsertioSortTest {

    /**
     * Verifica que el algoritmo de ordenamiento funcione correctamente con un arreglo de enteros.
     */
    @Test
    public <T extends Comparable<T>> void testSortWithGenerics() {
        InsertioSort<T> insertionSort = new InsertioSort<>();
        
        T[] arr = (T[]) new Comparable[] {5, 3, 8, 4, 2, 7, 6, 1}; 
        T[] sortedArr = (T[]) new Comparable[] {1, 2, 3, 4, 5, 6, 7, 8};
        
        T[] result = insertionSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    /**
     * Verifica que el algoritmo de ordenamiento funcione correctamente con un arreglo de cadenas de texto.
     */
    @Test
    public <T extends Comparable<T>> void testSortWithGenericsStrings() {
        InsertioSort<T> insertionSort = new InsertioSort<>();
        
        T[] arr = (T[]) new Comparable[] {"banana", "apple", "grape", "pear", "orange"};
        T[] sortedArr = (T[]) new Comparable[] {"apple", "banana", "grape", "orange", "pear"};
        
        T[] result = insertionSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    /**
     * Verifica que el algoritmo maneje correctamente el caso de un arreglo vacío.
     */
    @Test
    public <T extends Comparable<T>> void testSortWithEmptyArray() {
        InsertioSort<T> insertionSort = new InsertioSort<>();
        
        T[] arr = (T[]) new Comparable[] {};
        T[] sortedArr = (T[]) new Comparable[] {};
        
        T[] result = insertionSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    /**
     * Verifica que el algoritmo maneje correctamente el caso de un arreglo con un solo elemento.
     */
    @Test
    public <T extends Comparable<T>> void testSortWithSingleElement() {
        InsertioSort<T> insertionSort = new InsertioSort<>();
        
        T[] arr = (T[]) new Comparable[] {42};
        T[] sortedArr = (T[]) new Comparable[] {42};
        
        T[] result = insertionSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    /**
     * Verifica que el algoritmo no altere un arreglo que ya está ordenado.
     */
    @Test
    public <T extends Comparable<T>> void testSortAlreadySorted() {
        InsertioSort<T> insertionSort = new InsertioSort<>();
     
        T[] arr = (T[]) new Comparable[] {1, 2, 3, 4, 5};
        T[] sortedArr = (T[]) new Comparable[] {1, 2, 3, 4, 5};
        
        T[] result = insertionSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    /**
     * Verifica que el algoritmo maneje correctamente los arreglos con elementos duplicados.
     */
    @Test
    public <T extends Comparable<T>> void testSortWithDuplicates() {
        InsertioSort<T> insertionSort = new InsertioSort<>();
        
        T[] arr = (T[]) new Comparable[] {5, 1, 3, 3, 4, 5, 2};
        T[] sortedArr = (T[]) new Comparable[] {1, 2, 3, 3, 4, 5, 5};
        
        T[] result = insertionSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }
}

