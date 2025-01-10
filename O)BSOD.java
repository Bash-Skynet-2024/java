import javax.swing.*;
import java.awt.*;

public class virus {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setUndecorated(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JLabel label = new JLabel("A critical error has occurred. System will restart.", SwingConstants.CENTER);
        label.setFont(new Font("Courier New", Font.BOLD, 30));
        label.setForeground(Color.WHITE);
        label.setBackground(Color.BLUE);
        label.setOpaque(true);
        frame.add(label);
        frame.setVisible(true);

        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 5000) {
            // Infinite loop until 5 seconds have passed
        }

        frame.dispose();  // Close the frame after 5 seconds
    }
}
