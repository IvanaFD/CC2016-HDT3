import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

class DocumentTest {

    private static final String FILE_NAME = "document.txt";

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


