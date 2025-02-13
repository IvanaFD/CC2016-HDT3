/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Seccion 31
 * Hoja de Trabajo 3
 * Integrantes:
 * Diana Sosa 241040
 * Ivana Figueroa 24785
 * 
 * Clase IGenericSort
 * Define los metodos para realizar un sort
 * 
 */
import java.util.ArrayList;

interface IGenereicSort<T extends Comparable <T>> {
    
    void InsertionSort (ArrayList<T> list);
    void MergeSort (ArrayList<T> list);
    void QuickSort (ArrayList<T> list);
    void RadixSort (ArrayList<T> list);
    void CocktailSort (ArrayList<T> list);
    
    
}
