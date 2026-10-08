public class ThreadLifeCycle {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread is running");
                Thread.sleep(1000);
                System.out.println("Thread completed");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        System.out.println("New state");
        thread.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Runnable and Running states");
    }
}
