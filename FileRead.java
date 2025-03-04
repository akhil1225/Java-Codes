import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        
        String sourceFileName = args[0];
        String destinationFileName = args[1];
        
        try {
            
            FileReader reader = new FileReader(sourceFileName);
            FileWriter writer = new FileWriter(destinationFileName);

      
            int data;
            while ((data = reader.read()) != -1) {
                writer.write(data);
            }

           
            reader.close();
            writer.close();

            System.out.println("File copy successful!");
        } catch (IOException e) {
            System.out.println("An error occurred during file copy: " + e.getMessage());
        }
    }
}
