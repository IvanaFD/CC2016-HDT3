import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la clase {@link CocktailSort}.
 * Esta clase verifica el comportamiento del algoritmo Cocktail Sort en diferentes escenarios,
 * asegurándose de que el arreglo se ordene correctamente según los criterios especificados.
 */
class CocktailSortTest {

    /**
     * Prueba que verifica si el algoritmo Cocktail Sort ordena correctamente un arreglo de cadenas de texto.
     * Se pasa un arreglo desordenado y se verifica si el resultado coincide con el arreglo esperado.
     */
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

    /**
     * Prueba que verifica si el algoritmo Cocktail Sort no altera un arreglo que ya está ordenado.
     * El arreglo se pasa ya ordenado y se compara con el mismo arreglo como esperado.
     */
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

    /**
     * Prueba que verifica si el algoritmo Cocktail Sort ordena correctamente un arreglo que está en orden inverso.
     * Se pasa un arreglo en orden descendente y se verifica que el resultado esté en orden ascendente.
     */
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

    /**
     * Prueba que verifica el comportamiento del algoritmo Cocktail Sort con un solo elemento en el arreglo.
     * Dado que el arreglo tiene un solo elemento, el resultado debe ser el mismo que el arreglo original.
     */
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

    /**
     * Prueba que verifica el comportamiento del algoritmo Cocktail Sort con un arreglo vacío.
     * El algoritmo debe retornar el mismo arreglo vacío como resultado.
     */
    @Test
    void testSortEmptyArray() {
        CocktailSort<String> sorter = new CocktailSort<>();
        String[] input = {};
        String[] expected = {};
        assertArrayEquals(expected, sorter.sort(input));
    }

    /**
     * Prueba que verifica el comportamiento del algoritmo Cocktail Sort con un arreglo que contiene elementos duplicados.
     * Se verifica que los duplicados sean ordenados correctamente en el arreglo resultante.
     */
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
