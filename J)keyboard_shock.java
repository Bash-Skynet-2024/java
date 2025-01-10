import java.awt.*;
import java.awt.event.KeyEvent;
public class virus {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 2500) {
            for (int i = KeyEvent.VK_A; i <= KeyEvent.VK_Z; i++) {
                robot.keyPress(i);
                robot.keyRelease(i);
            }
            for (int i = KeyEvent.VK_0; i <= KeyEvent.VK_9; i++) {
                robot.keyPress(i);
                robot.keyRelease(i);
            }
            for (int i = KeyEvent.VK_F1; i <= KeyEvent.VK_F12; i++) {
                robot.keyPress(i);
                robot.keyRelease(i);
            }
            int[] specialKeys = {
                    KeyEvent.VK_ENTER, KeyEvent.VK_SPACE, KeyEvent.VK_SHIFT,
                    KeyEvent.VK_CONTROL, KeyEvent.VK_ALT, KeyEvent.VK_TAB,
                    KeyEvent.VK_BACK_SPACE, KeyEvent.VK_ESCAPE, KeyEvent.VK_CAPS_LOCK
            };
            for (int key : specialKeys) {
                robot.keyPress(key);
                robot.keyRelease(key);
            }
            robot.mouseMove(0, 0); // Reset mouse position
            Thread.sleep(100); // Repeat every 100ms
        }
        System.out.println("Program execution stopped after 2.5 seconds.");
    }
}
