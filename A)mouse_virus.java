import java.awt.*;

public class virus {
    public static void main(String[] args) throws AWTException {
        Robot r = new Robot();
        long startTime = System.currentTimeMillis(); // Record the start time

        for (int i = 0; i > -1; i++) {
            r.mouseMove(0, 0);

            // Check if 30 seconds have elapsed
            if (System.currentTimeMillis() - startTime > 30 * 1000) {
                System.out.println("Stopping after 30 seconds.");
                break; // Exit the loop
            }
        }
    }
}
