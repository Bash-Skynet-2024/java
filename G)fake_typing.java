import java.awt.*;
import java.util.Random;

public class virus {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        Random random = new Random();

        long startTime = System.currentTimeMillis(); // Record the start time

        while (System.currentTimeMillis() - startTime < 2500) { // Run for 2.5 seconds
            char randomChar = (char) (random.nextInt(26) + 'a'); // Random lowercase letter
            robot.keyPress(randomChar);
            robot.keyRelease(randomChar);
            Thread.sleep(100); // Adjust typing speed
        }
    }
}
