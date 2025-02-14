/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Sección 31
 * Hoja de Trabajo 3
 * Integrantes:
 * Diana Sosa 241040
 * Ivana Figueroa 24785
 * 
 * Interfaz IGenericSort
 * Define el método para realizar un algoritmo de ordenamiento genérico.
 * Esta interfaz es implementada por clases que desean realizar un ordenamiento
 * de arreglos de objetos que implementan la interfaz Comparable.
 * 
 * Parámetros:
 * T - Tipo de objeto que debe ser comparable (debe extender Comparable<T>).
 * 
 * Métodos:
 * - sort: Método abstracto que debe ser implementado para ordenar un arreglo
 *   de objetos del tipo T.
 */
interface IGenericSort<T extends Comparable<T>> {
    
   /**
    * Ordena un arreglo de objetos del tipo T.
    * 
    * @param arr Arreglo de objetos a ordenar.
    * @return Un nuevo arreglo de objetos ordenados.
    */
   public T[] sort(T[] arr);
}

