
import java.util.Arrays;
import java.util.Scanner;

/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Sección 31
 * Hoja de Trabajo 3
 * 
 * Clase Main
 * Contiene el punto de entrada del programa, permitiendo al usuario generar un documento
 * con números aleatorios y ordenarlo utilizando distintos algoritmos de ordenamiento.
 */
public class Main {

    /**
     * Método principal que ejecuta el programa.
     * Permite al usuario generar un documento de números aleatorios y ordenarlos
     * con diferentes algoritmos de ordenamiento.
     * 
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Document document = new Document();

        System.out.println("\n===== GENERADOR DE DOCUMENTO =====");
        System.out.print("Ingresa la cantidad de líneas (10 a 3000): ");
        int lines = scanner.nextInt();
        System.out.print("Ingresa la cantidad de números por línea: ");
        int wordsPerLine = scanner.nextInt();

        
        MyComparable[] numberArray;
        if (menuChoice == 1) {
            System.out.print("Ingresa la cantidad de líneas (10 a 3000): ");
            int lines = scanner.nextInt();
            System.out.print("Ingresa la cantidad de números por línea: ");
            int wordsPerLine = scanner.nextInt();
            document.createDocument(lines, wordsPerLine);
        }
        
        numberArray = document.readDocument();

        ArrayList<MyComparable> numberList = document.readDocument(MyComparable.class);
        MyComparable[] numbers = numberList.toArray(new MyComparable[0]); 

        IGenericSort<MyComparable> insertionSort = new InsertionSort<>();
        IGenericSort<MyComparable> quickSort = new QuickSort<>();
        IGenericSort<MyComparable> mergeSort = new MergeSort<>();
        IGenericSort<MyComparable> radixSort = new RadixSort<>();
        IGenericSort<MyComparable> cocktailSort = new CocktailSort<>();

        
        boolean running = true;
        while (running) {
            System.out.println("\n===== MENÚ DE ORDENAMIENTO =====");
            System.out.println("1. Insertion Sort");
            System.out.println("2. Quick Sort");
            System.out.println("3. Merge Sort");
            System.out.println("4. Radix Sort");
            System.out.println("5. Cocktail Sort");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            int choice = scanner.nextInt();
            MyComparable[] sortedArray = Arrays.copyOf(numberArray, numberArray.length); 

            switch (choice) {
                case 1:
                    System.out.println("\nOrdenando con Insertion Sort...");
                    sortedArray = insertionSort.sort(sortedArray);
                    break;
                case 2:
                    System.out.println("\nOrdenando con Quick Sort...");
                    sortedArray = quickSort.sort(sortedArray);
                    break;
                case 3:
                    System.out.println("\nOrdenando con Merge Sort...");
                    sortedArray = mergeSort.sort(sortedArray);
                    break;
                case 4:
                    System.out.println("\nOrdenando con Radix Sort...");
                    sortedArray = radixSort.sort(sortedArray);
                    break;
                case 5:
                    System.out.println("\nOrdenando con Cocktail Sort...");
                    sortedArray = cocktailSort.sort(sortedArray);
                    break;
                case 6:
                    document.writeSortedData(sortedArray);
                    running = false;
                    continue;
                default:
                    System.out.println("\nOpción inválida. Inténtalo de nuevo.");
                    continue;
            }

            System.out.println("Resultado: " + Arrays.toString(sortedArray));
        
        }

        scanner.close();
    }
}
