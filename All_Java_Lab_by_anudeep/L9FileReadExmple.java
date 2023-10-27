import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class L9FileReadExmple {
    public static void main(String[] args) {
        String filePath = "path/to/your/file.txt";

        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException("File not found: " + filePath);
            }

            if (file.length() == 0) {
                throw new EmptyFileException("File is empty: " + filePath);
            }

            FileInputStream fis = new FileInputStream(file);
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data); // Print the characters of the file
            }

            fis.close();
            System.out.println("\nFile read successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } catch (EmptyFileException e) {
            System.out.println("File is empty: " + e.getMessage());
        }
    }
}

class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}
