import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InsertioSortTest {

    @Test
    public <T extends Comparable<T>> void testSortWithGenerics() {
        InsertioSort<T> insertionSort = new InsertioSort<>();
        
        T[] arr = (T[]) new Comparable[] {5, 3, 8, 4, 2, 7, 6, 1}; 
        T[] sortedArr = (T[]) new Comparable[] {1, 2, 3, 4, 5, 6, 7, 8};
        
        T[] result = insertionSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    @Test
    public <T extends Comparable<T>> void testSortWithGenericsStrings() {
        InsertioSort<T> insertionSort = new InsertioSort<>();
        
        T[] arr = (T[]) new Comparable[] {"banana", "apple", "grape", "pear", "orange"};
        T[] sortedArr = (T[]) new Comparable[] {"apple", "banana", "grape", "orange", "pear"};
        
        T[] result = insertionSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    @Test
    public <T extends Comparable<T>> void testSortWithEmptyArray() {
        InsertioSort<T> insertionSort = new InsertioSort<>();
        
        T[] arr = (T[]) new Comparable[] {};
        T[] sortedArr = (T[]) new Comparable[] {};
        
        T[] result = insertionSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    @Test
    public <T extends Comparable<T>> void testSortWithSingleElement() {
        InsertioSort<T> insertionSort = new InsertioSort<>();
        
        T[] arr = (T[]) new Comparable[] {42};
        T[] sortedArr = (T[]) new Comparable[] {42};
        
        T[] result = insertionSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    @Test
    public <T extends Comparable<T>> void testSortAlreadySorted() {
        InsertioSort<T> insertionSort = new InsertioSort<>();
     
        T[] arr = (T[]) new Comparable[] {1, 2, 3, 4, 5};
        T[] sortedArr = (T[]) new Comparable[] {1, 2, 3, 4, 5};
        
        T[] result = insertionSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    @Test
    public <T extends Comparable<T>> void testSortWithDuplicates() {
        InsertioSort<T> insertionSort = new InsertioSort<>();
        
        T[] arr = (T[]) new Comparable[] {5, 1, 3, 3, 4, 5, 2};
        T[] sortedArr = (T[]) new Comparable[] {1, 2, 3, 3, 4, 5, 5};
        
        T[] result = insertionSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }
}
