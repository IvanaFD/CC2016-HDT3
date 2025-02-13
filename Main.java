import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Document document = new Document();

        System.out.print("Ingresa la cantidad de 10 a 3000 numeros :) : ");
        int lines = scanner.nextInt();
        System.out.print("Ingresa la cantidad de números por línea: ");
        int wordsPerLine = scanner.nextInt();

        document.createDocument(lines, wordsPerLine);

        NumberFileHelper<MyComparable> fileHelper = new NumberFileHelper<>("document.txt");
        ArrayList<MyComparable> numbers = fileHelper.readNumbersFromFile(MyComparable.class);

        SortingMethods<MyComparable> sorter = new SortingMethods<>();
        sorter.insertionSort(new ArrayList<>(numbers));
        sorter.quickSort(new ArrayList<>(numbers));
        sorter.mergeSort(new ArrayList<>(numbers));
        sorter.radixSort(new ArrayList<>(numbers));
        sorter.cocktailSort(new ArrayList<>(numbers));

        scanner.close();



    
    }
}
