import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CocktailSortTest {

    @Test
    void testSort() {
        CocktailSort<String> sorter = new CocktailSort<>();
        String[] input = {"apple", "orange", "banana", "grape", "kiwi"};
        String[] expected = {"apple", "banana", "grape", "kiwi", "orange"};
        String[] result = sorter.sort(input);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(0, result[i].compareTo(expected[i]));
        }
    }

    @Test
    void testSortAlreadySorted() {
        CocktailSort<String> sorter = new CocktailSort<>();
        String[] input = {"apple", "banana", "grape", "kiwi", "orange"};
        String[] expected = {"apple", "banana", "grape", "kiwi", "orange"};
        String[] result = sorter.sort(input);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(0, result[i].compareTo(expected[i]));
        }
    }

    @Test
    void testSortReverseOrder() {
        CocktailSort<String> sorter = new CocktailSort<>();
        String[] input = {"orange", "kiwi", "grape", "banana", "apple"};
        String[] expected = {"apple", "banana", "grape", "kiwi", "orange"};
        String[] result = sorter.sort(input);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(0, result[i].compareTo(expected[i]));
        }
    }

    @Test
    void testSortSingleElement() {
        CocktailSort<String> sorter = new CocktailSort<>();
        String[] input = {"apple"};
        String[] expected = {"apple"};
        String[] result = sorter.sort(input);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(0, result[i].compareTo(expected[i]));
        }
    }

    @Test
    void testSortEmptyArray() {
        CocktailSort<String> sorter = new CocktailSort<>();
        String[] input = {};
        String[] expected = {};
        assertArrayEquals(expected, sorter.sort(input));
    }

    @Test
    void testSortWithDuplicates() {
        CocktailSort<String> sorter = new CocktailSort<>();
        String[] input = {"orange", "kiwi", "banana", "kiwi", "apple"};
        String[] expected = {"apple", "banana", "kiwi", "kiwi", "orange"};
        String[] result = sorter.sort(input);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(0, result[i].compareTo(expected[i]));
        }
    }
}
