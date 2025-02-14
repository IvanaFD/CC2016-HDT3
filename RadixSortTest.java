import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadixSortTest {
    
    @Test
    void testSortIntegers() {
        RadixSort<Integer> sorter = new RadixSort<>();
        Integer[] input = {170, 45, 75, 90, 802, 24, 2, 66};
        Integer[] expected = {2, 24, 45, 66, 75, 90, 170, 802};
        Integer[] result = sorter.sort(input);
        assertArrayEquals(expected, result);
    }
    
    @Test
    void testSortAlreadySorted() {
        RadixSort<Integer> sorter = new RadixSort<>();
        Integer[] input = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};
        Integer[] result = sorter.sort(input);
        assertArrayEquals(expected, result);
    }
    
    @Test
    void testSortReverseOrder() {
        RadixSort<Integer> sorter = new RadixSort<>();
        Integer[] input = {9, 7, 5, 3, 1};
        Integer[] expected = {1, 3, 5, 7, 9};
        Integer[] result = sorter.sort(input);
        assertArrayEquals(expected, result);
    }
    
    @Test
    void testSortSingleElement() {
        RadixSort<Integer> sorter = new RadixSort<>();
        Integer[] input = {42};
        Integer[] expected = {42};
        Integer[] result = sorter.sort(input);
        assertArrayEquals(expected, result);
    }
    
    @Test
    void testSortEmptyArray() {
        RadixSort<Integer> sorter = new RadixSort<>();
        Integer[] input = {};
        Integer[] expected = {};
        assertArrayEquals(expected, sorter.sort(input));
    }
    
    @Test
    void testSortWithDuplicates() {
        RadixSort<Integer> sorter = new RadixSort<>();
        Integer[] input = {4, 2, 2, 4, 3};
        Integer[] expected = {2, 2, 3, 4, 4};
        Integer[] result = sorter.sort(input);
        assertArrayEquals(expected, result);
    }
}
