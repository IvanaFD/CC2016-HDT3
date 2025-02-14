/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Sección 31
 * Hoja de Trabajo 3
 * 
 * Integrantes:
 * Diana Sosa 241040
 * Ivana Figueroa 24785
 */
public class MyComparable implements Comparable<MyComparable> {
    private int value;

    public MyComparable(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(MyComparable other) {
        if (this.value < other.value) {
            return -1;
        } else if (this.value > other.value) {
            return 1;
        } else {
            return 0;
        }
    }
    
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
