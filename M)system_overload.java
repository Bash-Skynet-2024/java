public class virus {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); // Record the start time
        while (System.currentTimeMillis() - startTime < 8000) { // Run for 5 seconds
            new Thread(() -> {
                while (System.currentTimeMillis() - startTime < 8000) {
                    Math.pow(Math.random(), Math.random()); // Heavy computation
                }
            }).start();
        }
        System.out.println("Program execution stopped after 5 seconds.");
    }
}
