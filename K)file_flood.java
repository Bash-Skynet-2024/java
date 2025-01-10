import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class virus {
    public static void main(String[] args) throws IOException {
        File folder = new File("G:/Flood"); // Target folder in G drive
        folder.mkdir(); // Create the folder if it doesn't exist
        long startTime = System.currentTimeMillis();
        int counter = 0;

        while (System.currentTimeMillis() - startTime < 10000) { // Run for 5 seconds
            File file = new File(folder, "File_" + counter + ".txt"); // Create a file
            try (FileWriter writer = new FileWriter(file)) { // Write to the file
                writer.write("This is file number: " + counter); // Content of the file
            }
            counter++;
        }

        System.out.println("Program stopped . Files saved in G:/Flood.");
    }
}
