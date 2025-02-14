/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Sección 31
 * Hoja de Trabajo 3
 * 
 * Integrantes:
 * Diana Sosa 241040
 * Ivana Figueroa 24785
 */
import java.util.Arrays;

public class RadixSort implements IGenericSort<MyComparable> {
    @Override
    public MyComparable[] sort(MyComparable[] arr) {
        if (arr.length == 0) return arr;
        Integer[] intArr = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i].toString());
        }
        int max = Arrays.stream(intArr).max(Integer::compare).orElse(0);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(intArr, exp);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new MyComparable(intArr[i]);
        }
        return arr;
    }

    private void countingSortByDigit(Integer[] arr, int exp) {
        int n = arr.length;
        Integer[] output = new Integer[n];
        int[] count = new int[10];
        for (int num : arr) {
            count[(num / exp) % 10]++;
        }
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            int num = arr[i];
            output[count[(num / exp) % 10] - 1] = num;
            count[(num / exp) % 10]--;
        }
        System.arraycopy(output, 0, arr, 0, n);
    }
}
