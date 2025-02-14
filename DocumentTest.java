import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Sección 31
 * Hoja de Trabajo 3
 * Integrantes:
 * Diana Sosa 241040
 * Ivana Figueroa 24785
 * 
 * Clase DocumentTest
 * Esta clase contiene pruebas unitarias para la clase Document, verificando el comportamiento de 
 * su método createDocument, que genera un archivo de texto con líneas y palabras aleatorias.
 * Las pruebas cubren diversos casos, como la creación de un documento vacío, un documento con una línea, 
 * y un documento con múltiples líneas.
 * 
 * Métodos:
 * - testCreateDocument: Verifica que el documento se cree correctamente con el número esperado de líneas 
 *   y palabras en el rango especificado.
 * - testEmptyDocument: Verifica que si se solicita un documento sin líneas, el archivo se quede vacío.
 * - testSingleLineDocument: Verifica que se cree un archivo con una sola línea de palabras aleatorias.
 */
class DocumentTest {

    private static final String FILE_NAME = "document.txt";

    /**
     * Verifica que el método createDocument cree un archivo con el número correcto de líneas y palabras,
     * y que los números generados estén dentro del rango esperado.
     */
    @Test
    void testCreateDocument() {
        Document document = new Document();
        int lines = 5;
        int wordsPerLine = 5;
        
        document.createDocument(lines, wordsPerLine);

        try {
            List<String> fileLines = Files.readAllLines(Paths.get(FILE_NAME));
            assertEquals(lines, fileLines.size(), "El número de líneas no es el esperado.");
            
            for (String line : fileLines) {
                String[] words = line.split("\\s+");
                assertEquals(wordsPerLine, words.length, "El número de palabras en una línea no es el esperado.");
                
                for (String word : words) {
                    int number = Integer.parseInt(word);
                    assertTrue(number >= 10 && number <= 3000, "El número " + number + " está fuera del rango esperado.");
                }
            }

        } catch (IOException e) {
            fail("Hubo un error al leer el archivo: " + e.getMessage());
        }
    }
    
    /**
     * Verifica que si el número de líneas es 0, el archivo generado esté vacío.
     */
    @Test
    void testEmptyDocument() {
        Document document = new Document();
        int lines = 0;
        int wordsPerLine = 5;
        
        document.createDocument(lines, wordsPerLine);

        try {
            List<String> fileLines = Files.readAllLines(Paths.get(FILE_NAME));
            assertTrue(fileLines.isEmpty(), "El archivo no está vacío.");
        } catch (IOException e) {
            fail("Hubo un error al leer el archivo: " + e.getMessage());
        }
    }

    /**
     * Verifica que si se solicita un documento con una sola línea, el archivo contenga esa línea y el número
     * esperado de palabras.
     */
    @Test
    void testSingleLineDocument() {
        Document document = new Document();
        int lines = 1;
        int wordsPerLine = 5;
        
        document.createDocument(lines, wordsPerLine);

        try {
            List<String> fileLines = Files.readAllLines(Paths.get(FILE_NAME));
            assertEquals(1, fileLines.size(), "El archivo no tiene una línea.");
 
            String[] words = fileLines.get(0).split("\\s+");
            assertEquals(wordsPerLine, words.length, "El número de palabras en la línea no es el esperado.");
        } catch (IOException e) {
            fail("Hubo un error al leer el archivo: " + e.getMessage());
        }
    }
}



