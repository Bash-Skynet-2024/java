import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class virus {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setUndecorated(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setVisible(true);
        Random random = new Random();
        long startTime = System.currentTimeMillis(); // Record the start time
        long duration = 3000; // Set the duration to 3 seconds (3000 milliseconds)
        while (System.currentTimeMillis() - startTime <= duration) {
            // Change panel background to a random color
            panel.setBackground(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            panel.repaint();
            try {
                Thread.sleep(100); // Adjust flicker speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        frame.dispose();
    }
}
