
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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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

    public MyComparable[] readDocument() {
        ArrayList<MyComparable> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.trim().split("\\s+");
                for (String token : tokens) {
                    if (!token.isEmpty()) {
                        int value = Integer.parseInt(token);
                        list.add(new MyComparable(value));
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el documento: " + e.getMessage());
        }
        return list.toArray(new MyComparable[0]);
    }

    public void writeSortedData(MyComparable[] sortedArray) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (MyComparable num : sortedArray) {
                writer.write(num.toString() + " ");
            }
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error al guardar los datos ordenados: " + e.getMessage());
        }
    }


}