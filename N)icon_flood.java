import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class virus {
    public static void main(String[] args) throws IOException {
        File desktop = new File(System.getProperty("user.home") + "/Desktop");
        File targetFolder = new File(desktop, "target");
        int counter = 0;
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 10000) {
            File shortcut = new File(targetFolder, "Shortcut_" + counter + ".lnk");
            try (FileWriter writer = new FileWriter(shortcut)) {
                writer.write("[InternetShortcut]\nURL=http://example.com");
            }
            counter++;
        }
        System.out.println("Program execution stopped after 10 seconds.");
    }
}
