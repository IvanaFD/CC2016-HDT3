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
    
    void insertionSort (ArrayList<T> list);
    void mergeSort (ArrayList<T> list);
    void quickSort (ArrayList<T> list);
    void radixSort (ArrayList<T> list);
    void cocktailSort (ArrayList<T> list);
    
    
}
