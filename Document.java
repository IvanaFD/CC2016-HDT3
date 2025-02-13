
/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Seccion 31
 * Hoja de Trabajo 3
 * Integrantes:
 * Diana Sosa 241040
 * Ivana Figueroa 24785
 * 
 * Clase Document
 * se generara dependiendo lo indicado del usuario la cantidad de lineas randoms y se guardaran en documento tipo txt
 * 
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Document {
    private static final String FILE_NAME = "document.txt";
    
    public void createDocument(int lines, int wordsPerLine) {
    Random random = new Random();

    try (FileWriter writer = new FileWriter(FILE_NAME)) {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < wordsPerLine; j++) {
                int numberRandom = random.nextInt(10,3001);
                writer.write(numberRandom + " ");
            }
            writer.write("\n");
        }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());}
                

    
    }
}