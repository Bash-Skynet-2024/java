import javax.swing.JOptionPane;
import java.awt.*;
public class virus {
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
        Thread mouse = new Thread(new Runnable() {
            public void run() {
                do {
                    robot.mouseMove(0, 0);
                } while (true);
            }
        });
        Thread dialog = new Thread(new Runnable() {
            public void run() {
                while (true) {

                    JOptionPane.showConfirmDialog(null,
                            "Virus Detected",
                            "ERROR",
                            JOptionPane.YES_NO_OPTION);
                }
            }
        });
        mouse.start();
        dialog.start();
    }
}
