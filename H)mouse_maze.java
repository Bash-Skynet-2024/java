import java.awt.*;
import java.util.Random;

public class virus {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        Random random = new Random();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // Get screen dimensions
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        long startTime = System.currentTimeMillis(); // Record the start time

        while (System.currentTimeMillis() - startTime < 2500) { // Run for 2.5 seconds
            int x = random.nextInt(screenWidth); // Random X coordinate across the entire width
            int y = random.nextInt(screenHeight); // Random Y coordinate across the entire height
            robot.mouseMove(x, y); // Move the mouse to the new random position
            Thread.sleep(10); // Reduce delay for faster movement
        }
    }
}
