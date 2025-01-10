import java.util.ArrayList;

public class virus {
    public static void main(String[] args) {
        ArrayList<int[]> memoryHog = new ArrayList<>();
        long startTime = System.currentTimeMillis();

        while (System.currentTimeMillis() - startTime < 5000) {  // Stop after 5 seconds
            memoryHog.add(new int[10_000_000]); // Allocate large memory chunks
        }

        System.out.println("Memory allocation stopped after 5 seconds.");
    }
}
