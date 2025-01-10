import javax.swing.*;
import java.awt.*;
public class virus {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setUndecorated(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setAlwaysOnTop(true);
        JLabel label = new JLabel("Your System Is Locked!", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 40));
        label.setForeground(Color.RED);
        frame.add(label);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setVisible(true);
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 5000) {
            // Prevent closing by continuously looping for 5 seconds
        }
        frame.dispose();
        System.out.println("Program stopped after 5 seconds.");
    }
}
