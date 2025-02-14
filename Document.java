/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Sección 31
 * Hoja de Trabajo 3
 * Integrantes:
 * Diana Sosa 241040
 * Ivana Figueroa 24785
 * 
 * Clase Document
 * Esta clase se encarga de generar un documento de texto (.txt) que contiene una cantidad 
 * específica de líneas, donde cada línea está compuesta por un número aleatorio de palabras 
 * generadas dentro de un rango específico. El documento generado se guarda con el nombre "document.txt".
 * 
 * Métodos:
 * - createDocument: Crea un archivo de texto con una cantidad específica de líneas y palabras 
 *   aleatorias en cada línea.
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Document {
    private static final String FILE_NAME = "document.txt";
    
    /**
     * Este método crea un documento de texto llamado "document.txt" y escribe en él una 
     * cantidad específica de líneas. Cada línea contiene un número aleatorio de palabras 
     * generadas dentro del rango de 10 a 3000.
     * 
     * @param lines La cantidad de líneas que el documento debe contener.
     * @param wordsPerLine La cantidad de palabras aleatorias que debe contener cada línea.
     */
    public void createDocument(int lines, int wordsPerLine) {
        Random random = new Random();

        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            for (int i = 0; i < lines; i++) {
                for (int j = 0; j < wordsPerLine; j++) {
                    int numberRandom = random.nextInt(10, 3001);
                    writer.write(numberRandom + " ");
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
