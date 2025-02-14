import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuickSortTest {

    @Test
    public <T extends Comparable<T>> void testSortWithGenerics() {
        QuickSort<T> quickSort = new QuickSort<>();
        
        T[] arr = (T[]) new Comparable[] {5, 3, 8, 4, 2, 7, 6, 1}; 
        T[] sortedArr = (T[]) new Comparable[] {1, 2, 3, 4, 5, 6, 7, 8};
        
        T[] result = quickSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    @Test
    public <T extends Comparable<T>> void testSortWithGenericsStrings() {
        QuickSort<T> quickSort = new QuickSort<>();
        
        T[] arr = (T[]) new Comparable[] {"banana", "apple", "grape", "pear", "orange"};
        T[] sortedArr = (T[]) new Comparable[] {"apple", "banana", "grape", "orange", "pear"};
        
        T[] result = quickSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    @Test
    public <T extends Comparable<T>> void testSortWithEmptyArray() {
        QuickSort<T> quickSort = new QuickSort<>();
        
        T[] arr = (T[]) new Comparable[] {};
        T[] sortedArr = (T[]) new Comparable[] {};
        
        T[] result = quickSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    @Test
    public <T extends Comparable<T>> void testSortWithSingleElement() {
        QuickSort<T> quickSort = new QuickSort<>();
        
        T[] arr = (T[]) new Comparable[] {42};
        T[] sortedArr = (T[]) new Comparable[] {42};
        
        T[] result = quickSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    @Test
    public <T extends Comparable<T>> void testSortAlreadySorted() {
        QuickSort<T> quickSort = new QuickSort<>();
        
        T[] arr = (T[]) new Comparable[] {1, 2, 3, 4, 5};
        T[] sortedArr = (T[]) new Comparable[] {1, 2, 3, 4, 5};
        
        T[] result = quickSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }

    @Test
    public <T extends Comparable<T>> void testSortWithDuplicates() {
        QuickSort<T> quickSort = new QuickSort<>();
     
        T[] arr = (T[]) new Comparable[] {5, 1, 3, 3, 4, 5, 2};
        T[] sortedArr = (T[]) new Comparable[] {1, 2, 3, 3, 4, 5, 5};
        
        T[] result = quickSort.sort(arr);
        assertArrayEquals(sortedArr, result); 
    }
}


