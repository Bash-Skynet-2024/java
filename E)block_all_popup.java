import java.util.Random;import javax.swing.*;import java.awt.event.KeyEvent;import java.awt.AWTException;
import java.awt.Robot;import java.awt.Toolkit;import java.awt.Dimension;
public class virus {
    private final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private final int height = (int) screenSize.getHeight();
    private final int width = (int) screenSize.getWidth();
    private final Random random = new Random();
    public void BlockAll() throws AWTException {
        Robot _robot = new Robot();
        _robot.keyPress(KeyEvent.VK_8);
        _robot.mouseMove(random.nextInt(width), random.nextInt(height));
    }
    public void popup() {
        JFrame window = new JFrame();
        JLabel label = new JLabel("You are infected with Funny Virus ;)", JLabel.CENTER);
        window.add(label);
        window.setSize(150, 50);
        window.setLocation(random.nextInt(width), random.nextInt(height));
        window.setVisible(true);
    }
    public static void main(String[] args) throws AWTException, InterruptedException {
        virus fv = new virus();
        long startTime = System.currentTimeMillis();
        long maxDuration = 5000; // 5 seconds
        while (System.currentTimeMillis() - startTime < maxDuration) {
            fv.BlockAll();
            fv.popup();
        }
        System.out.println("Virus stopped after 5 seconds.");
    }
}
