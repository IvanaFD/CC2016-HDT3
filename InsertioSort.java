/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Sección 31
 * Hoja de Trabajo 3
 * Integrantes:
 * Diana Sosa 241040
 * Ivana Figueroa 24785
 * 
 *
 */
public class InsertioSort<T extends Comparable<T>> implements IGenericSort<T> {
    

    //referencia del insertion sort: https://www.w3schools.com/dsa/trydsa.php?filename=demo_insertionsort
    @Override
    public T[] sort(T[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            T Element = arr[i];
            int j = i -1;
            while (j >= 0 && arr[j].compareTo(Element) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = Element;
            }
            return arr;
        }
            
}

 