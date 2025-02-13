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


interface IGenereicSort<T extends Comparable <T>> {
    
   public T[] sort(T[] arr);
    
    
}
