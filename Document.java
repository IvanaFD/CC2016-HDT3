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