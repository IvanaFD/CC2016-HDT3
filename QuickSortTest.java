/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Sección 31
 * Hoja de Trabajo 3
 * Integrantes:
 * Diana Sosa 241040
 * Ivana Figueroa 24785
 * 
 * Clase QuickSortTest
 * Pruebas unitarias para la clase QuickSort utilizando JUnit 5. Estas pruebas
 * verifican el funcionamiento del algoritmo de ordenamiento QuickSort en
 * diferentes escenarios con tipos genéricos. Las pruebas aseguran que el
 * algoritmo ordene correctamente los arreglos de enteros, cadenas, así como
 * casos especiales como arreglos vacíos, de un solo elemento, ya ordenados
 * o con elementos duplicados.
 * 
 * Métodos:
 * - testSortWithGenerics: Verifica el correcto ordenamiento de un arreglo de enteros.
 * - testSortWithGenericsStrings: Verifica el correcto ordenamiento de un arreglo de cadenas.
 * - testSortWithEmptyArray: Verifica el comportamiento de QuickSort con un arreglo vacío.
 * - testSortWithSingleElement: Verifica el comportamiento de QuickSort con un arreglo de un solo elemento.
 * - testSortAlreadySorted: Verifica el comportamiento de QuickSort con un arreglo ya ordenado.
 * - testSortWithDuplicates: Verifica el comportamiento de QuickSort con un arreglo que contiene elementos duplicados.
 */
public class QuickSortTest {

    /**
     * Verifica el correcto ordenamiento de un arreglo de enteros utilizando QuickSort.
     */
    @Test
    public <T extends Comparable<T>> void testSortWithGenerics() {
        QuickSort<T> quickSort = new QuickSort<>();
        
        T[] arr = (T[]) new Comparable[] {5, 3, 8, 4, 2, 7, 6, 1}; 
        T[] sortedArr = (T[]) new Comparable[] {1, 2, 3, 4, 5, 6, 7, 8};
        
        T[] result = quickSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    /**
     * Verifica el correcto ordenamiento de un arreglo de cadenas utilizando QuickSort.
     */
    @Test
    public <T extends Comparable<T>> void testSortWithGenericsStrings() {
        QuickSort<T> quickSort = new QuickSort<>();
        
        T[] arr = (T[]) new Comparable[] {"banana", "apple", "grape", "pear", "orange"};
        T[] sortedArr = (T[]) new Comparable[] {"apple", "banana", "grape", "orange", "pear"};
        
        T[] result = quickSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    /**
     * Verifica el comportamiento de QuickSort con un arreglo vacío.
     */
    @Test
    public <T extends Comparable<T>> void testSortWithEmptyArray() {
        QuickSort<T> quickSort = new QuickSort<>();
        
        T[] arr = (T[]) new Comparable[] {};
        T[] sortedArr = (T[]) new Comparable[] {};
        
        T[] result = quickSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    /**
     * Verifica el comportamiento de QuickSort con un arreglo de un solo elemento.
     */
    @Test
    public <T extends Comparable<T>> void testSortWithSingleElement() {
        QuickSort<T> quickSort = new QuickSort<>();
        
        T[] arr = (T[]) new Comparable[] {42};
        T[] sortedArr = (T[]) new Comparable[] {42};
        
        T[] result = quickSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    /**
     * Verifica el comportamiento de QuickSort con un arreglo ya ordenado.
     */
    @Test
    public <T extends Comparable<T>> void testSortAlreadySorted() {
        QuickSort<T> quickSort = new QuickSort<>();
        
        T[] arr = (T[]) new Comparable[] {1, 2, 3, 4, 5};
        T[] sortedArr = (T[]) new Comparable[] {1, 2, 3, 4, 5};
        
        T[] result = quickSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    /**
     * Verifica el comportamiento de QuickSort con un arreglo que contiene elementos duplicados.
     */
    @Test
    public <T extends Comparable<T>> void testSortWithDuplicates() {
        QuickSort<T> quickSort = new QuickSort<>();
     
        T[] arr = (T[]) new Comparable[] {5, 1, 3, 3, 4, 5, 2};
        T[] sortedArr = (T[]) new Comparable[] {1, 2, 3, 3, 4, 5, 5};
        
        T[] result = quickSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }
}

