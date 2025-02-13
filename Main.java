import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[]  args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de  10 a 3000 numeros");
        int count = scanner.nextInt();

        NumberFileHelper<Mycomparable> fileHelper = new NumberFileHelper<>("numbers.txt");
        fileHelper.generateRandomNumbers(count, MyComparable.class);

        ArrayList<MyComparable> numbers = fileHelper.readNumbersFromFile(MyComparable.class);

        SortingMethods<MyComparable> sorter = new SortingMethods<>();
        sorter.insertionSort(new ArrayList<>(numbers));
        sorter.quickSort(new ArrayList<>(numbers));
        sorter.mergeSort(new ArrayList<>(numbers));

        scanner.close();
    }
}