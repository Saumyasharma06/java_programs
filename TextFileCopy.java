
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileCopy {
    public static void main(String[] args) {
        
        String sourceFilePath = "D://java_programs//file//test.txt";
        String destinationFilePath = "D://java_programs//file//newTest.txt1";
        try {
            copyTextFile(sourceFilePath, destinationFilePath);
            System.out.println("Text file copied successfully!");
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
    
    public static void copyTextFile(String sourcePath, String destinationPath) throws IOException {
        
        try (FileReader reader = new FileReader(sourcePath); 
             FileWriter writer = new FileWriter(destinationPath)) {
            
            int character;
            
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
        }
    }
}

