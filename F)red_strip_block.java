import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class virus {

    public static void main(String[] args) throws AWTException {
        // Get screen dimensions
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();

        // Message to display
        String message = "fcuk";

        // Dimensions for each strip (container)
        int stripWidth = screenWidth / 10; // Divide the screen width into 10 parts
        int stripHeight = screenHeight / 10; // Divide the screen height into 10 parts

        // Create a robot to block keyboard and mouse input
        Robot robot = new Robot();
        Thread blockInputThread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.mouseMove(0, 0);
            }
        });
        blockInputThread.start();

        // Create and display strips in a grid (10x10 layout)
        JFrame[] frames = new JFrame[100];
        int index = 0;

        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                frames[index++] = createRedStrip(x * stripWidth, y * stripHeight, stripWidth, stripHeight, message);
            }
        }

        // Run the program for 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop the program: Close all frames and stop input blocking
        for (JFrame frame : frames) {
            if (frame != null) frame.dispose();
        }
        blockInputThread.interrupt(); // Stop blocking input
        System.exit(0); // Terminate the program
    }

    public static JFrame createRedStrip(int x, int y, int width, int height, String message) {
        // Create a new JFrame for each strip
        JFrame frame = new JFrame();
        frame.setUndecorated(true); // Remove window borders
        frame.setAlwaysOnTop(true); // Ensure it stays on top
        frame.setBounds(x, y, width, height); // Set location and size

        // Create a JPanel with a red background
        JPanel panel = new JPanel();
        panel.setBackground(Color.RED);
        panel.setLayout(new BorderLayout());

        // Add a message to the panel
        JLabel label = new JLabel(message, JLabel.CENTER);
        label.setForeground(Color.WHITE); // Set text color
        label.setFont(new Font("Arial", Font.BOLD, 14)); // Set font style and size
        panel.add(label, BorderLayout.CENTER);

        frame.add(panel);
        frame.setVisible(true); // Make the frame visible
        return frame;
    }
}
