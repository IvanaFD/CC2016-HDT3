import java.util.ArrayList;

interface IGenereicSort<T extends Comparable <T>> {
    
    void InsertionSort (ArrayList<T> list);
    void MergeSort (ArrayList<T> list);
    void QuickSort (ArrayList<T> list);
    void RadixSort (ArrayList<T> list);
    void CocktailSort (ArrayList<T> list);
    
    
}
