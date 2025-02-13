import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Document document = new Document();

        System.out.println("\n===== GENERADOR DE DOCUMENTO =====");
        System.out.print("Ingresa la cantidad de líneas 10 a 3000 :) : ");
        int lines = scanner.nextInt();
        System.out.print("Ingresa la cantidad de números por línea: ");
        int wordsPerLine = scanner.nextInt();

        document.createDocument(lines, wordsPerLine);

        ArrayList<MyComparable> numberList = document.readDocument(MyComparable.class);
        MyComparable[] numbers = numberList.toArray(new MyComparable[0]); 

        IGenereicSort<MyComparable> insertionSort = new InsertioSort<>();
        IGenereicSort<MyComparable> quickSort = new QuickSort<>();
        IGenereicSort<MyComparable> mergeSort = new MergeSort<>();
        IGenereicSort<MyComparable> radixSort = new RadixSort<>();
        IGenereicSort<MyComparable> cocktailSort = new CocktailSort<>();

        boolean running = true;
        while (running) {
            System.out.println("\n===== MENÚ DE ORDENAMIENTO =====");
            System.out.println("1. Insertion Sort");
            System.out.println("2. Quick Sort");
            System.out.println("3. Merge Sort");
            System.out.println("4. Radix Sort");
            System.out.println("5. Cocktail Sort");
            System.out.println("6. Salir");
            System.out.print("Elige una opción :) : ");

            int choice = scanner.nextInt();
            MyComparable[] sortedArray = Arrays.copyOf(numbers, numbers.length); 

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
                    System.out.println("\nSaliendo del programa. ¡Hasta luego!");
                    running = false;
                    continue;
                default:
                    System.out.println("\nOpción inválida :( . Inténtalo de nuevo.");
                    continue;
            }

            System.out.println("Resultado: " + Arrays.toString(sortedArray));
        }

        scanner.close();
    }
}
